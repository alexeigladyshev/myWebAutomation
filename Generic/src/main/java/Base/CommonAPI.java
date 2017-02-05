package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleks_000 on 1/30/2017.
 */
public class CommonAPI {

    public WebDriver driver = null;

    @Parameters ({"url"})
    @BeforeMethod
    public void setUp(String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aleks_000\\IdeaProjects\\TestAppMentoring\\Generic\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);


    }
    @AfterMethod
    public void tearDown(){

        driver.close();
        driver = null;
    }

    public void clickByXpath(String locator){ driver.findElement(By.xpath(locator)).click(); }
    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
}
