package PageFactoryMain;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleks_000 on 2/14/2017.
 */
public class CommonMethods extends CommonAPI {

    private String username = "aleksey.gladyshev@yahoo.com";
    private String password = "abcdefg123";

    public void performSignIn() throws InterruptedException {

        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div/form/fieldset[1]/input"))
                .sendKeys(username);

        Thread.sleep(2000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();

    }
}
