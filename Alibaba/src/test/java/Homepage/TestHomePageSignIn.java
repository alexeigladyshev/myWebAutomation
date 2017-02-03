package Homepage;

import Base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 2/1/2017.
 */
public class TestHomePageSignIn extends CommonAPI {

    @Test
    public void AlibabaSignInNavigate() throws InterruptedException {

        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(driver.findElement(By.cssSelector(".J-hd-m-notify-tab-trigger.sc-hd-ms-trigger.sc-hd-ms-unsign"))
        ).moveToElement(driver.findElement(By.cssSelector(".sc-hd-ms-btsignin"))
        ).click().build().perform();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#fm-login-submit")).isDisplayed());



    }
}
