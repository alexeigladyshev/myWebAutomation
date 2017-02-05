package Homepage;

import Base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 2/3/2017.
 */
public class TestSignIn extends CommonAPI {

    @Test(priority = 3)
    public void testSignInBlankCredentials() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]/span")));
        Thread.sleep(3000);
        actions.click(driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span"))).perform();
        //Thread.sleep(3000);
        clickByXpath(".//*[@id='signInSubmit']");
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-email-missing-alert']/div/div")).getText().contains("Enter your email or mobile phone number"));
        //Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-password-missing-alert']/div/div")).getText().equals(" Enter your password"));
    }
    //@Test(priority = 4)
    public void TestSignInNoPassword(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span"))).click().build().perform();
        typeByXpath(".//*[@id='ap_email']","Incorrectuser");
        clickByXpath(".//*[@id='signInSubmit']");
        org.testng.Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-password-missing-alert']/div/div")).getText().contains("Enter your password"));
    }

    //@Test(priority = 5)
    public void TestSignInIncorrectCredentials(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span"))).click().build().perform();
        typeByXpath(".//*[@id='ap_email']","Incorrectuser");
        typeByXpath(".//*[@id='ap_password']", "Incorrectpassword");
        clickByXpath(".//*[@id='signInSubmit']");
        org.testng.Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-warning-message-box']/div/div/ul/li/span")).getText().contains("To better protect your account"));

    }
}
