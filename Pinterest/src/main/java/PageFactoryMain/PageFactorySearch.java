package PageFactoryMain;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by aleks_000 on 2/14/2017.
 */
public class PageFactorySearch extends CommonAPI {

    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[2]/div/div/div[1]/div/a[1]")
    public static WebElement btnCompass;

    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[7]/a/div/div")
    public static WebElement btnMensHealth;

    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[8]/a/div/div")
    public static WebElement btnBeauty;

    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[9]/a/div/div")
    public static WebElement btnHumor;

    public void clickOnMensHealth() throws InterruptedException {

        btnCompass.click();
        Thread.sleep(3000);
        btnMensHealth.click();

    }

    public void clickOnBeauty() throws InterruptedException {

        btnCompass.click();
        Thread.sleep(3000);
        btnBeauty.click();
    }

    public void clickOnHumor() throws InterruptedException {

        btnCompass.click();
        Thread.sleep(3000);
        btnHumor.click();
    }
}
