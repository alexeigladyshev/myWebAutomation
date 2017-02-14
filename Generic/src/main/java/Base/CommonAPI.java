package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by aleks_000 on 1/30/2017.
 */
public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"useCloudEnv","userName","accessKey","os","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("alexeigladyshev") String userName, @Optional("")
            String accessKey, @Optional("Windows 10") String os, @Optional("chrome") String browserName, @Optional("34")
                              String browserVersion, @Optional("") String url)throws IOException {

        if(useCloudEnv){
            //run in cloud
            getCloudDriver(userName,accessKey,os,browserName,browserVersion);

        }else{
            //run in local
            getLocalDriver(os,browserName);

        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){

        driver.close();
        driver = null;
    }

    public WebDriver getCloudDriver(String userName,String accessKey,String os, String browserName,
                                    String browserVersion)throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", os);
        cap.setBrowserName(browserName);
        cap.setCapability("version",browserVersion);
        driver = new RemoteWebDriver(new URL("http://"+userName+":"+accessKey+
                "@ondemand.saucelabs.com:80/wd/hub"), cap);
        return driver;
    }

    public WebDriver getLocalDriver(String OS,String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Win")){
                System.setProperty("webdriver.chrome.driver", "../Generic/Drivers/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
            }else if(OS.equalsIgnoreCase("Win")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }

    public void clickByXpath(String locator){ driver.findElement(By.xpath(locator)).click(); }
    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
}