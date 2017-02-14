package Homepage;

import Base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import java.text.DateFormat;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by aleks_000 on 2/9/2017.
 */
public class TakesScreenShot extends CommonAPI {

    private String username = "aleksey.gladyshev@yahoo.com";
    private String password = "abcdefg123";

    @Test
    public void takesScrnShotExample() throws IOException, InterruptedException {

        //enter my email into email text box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[1]/input"))
                .sendKeys(username);

        //wait 5 seconds before entering password
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();

        //wait 5 seconds before taking a screenshot
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(scrFile.getAbsolutePath());

        DateFormat df = new SimpleDateFormat("ddMMyy-HHmmss");
        Date dateobj = new Date();

        df.format(dateobj);
        String fileName = "Screenshots\\screenshot"+df.format(dateobj)+".png";
        FileUtils.copyFile(scrFile, new File(fileName));


    }
}
