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
    public void AlibabaSignInNavigate(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='J_SC_header']/header/div[2]/div[3]/div[1]/div[1]"))
        ).moveToElement(driver.findElement(By.xpath(".//*[@id='J_SC_header']/header/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/a[1]"))
        ).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='fm-login-submit']")).isDisplayed());



    }
}
