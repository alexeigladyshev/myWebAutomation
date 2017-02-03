package Homepage;

import Base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 2/3/2017.
 */
public class TestHomeTopNav extends CommonAPI {

    @Test (priority = 1)
    public void TestYourStoreLink(){

        clickByXpath(".//*[@id='nav-your-amazon']");
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='a-page']/div[1]/div[3]/div/div/form/div/div/div/h1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='signInSubmit']")).isDisplayed());

    }
    @Test (priority = 2)
    public void TestDealsStoreLink(){

        clickByXpath(".//*[@id='nav-xshop']/a[2]");
        Assert.assertTrue(driver.getTitle().contains("Gold Box Deals"));

    }
}
