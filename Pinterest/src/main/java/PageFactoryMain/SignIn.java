package PageFactoryMain;

import Base.CommonAPI;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * Created by aleks_000 on 2/14/2017.
 */
public class SignIn extends CommonAPI {


    public void performSignIn() throws IOException, InterruptedException {

        String username = "aleksey.gladyshev@yahoo.com";
        String password = "abcdefg123";

        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[1]/input"))
                .sendKeys(username);

        Thread.sleep(4000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();

        //wait 5 seconds before taking a screenshot
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
