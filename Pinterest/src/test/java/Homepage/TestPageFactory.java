package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.yaml.snakeyaml.nodes.NodeId.sequence;

/**
 * Created by aleks_000 on 2/14/2017.
 */
public class TestPageFactory extends CommonAPI {

    String username = "aleksey.gladyshev@yahoo.com";
    String password = "abcdefg123";

    @Test
    public void search1() throws InterruptedException, IOException {

        //signing in
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[1]/input"))
                .sendKeys(username);
        Thread.sleep(4000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();


        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);

        sequence.clickOnBeauty();
    }

    @Test
    public void search2() throws InterruptedException, IOException {

        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[1]/input"))
                .sendKeys(username);
        Thread.sleep(4000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();


        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);
        sequence.clickOnHumor();
    }

    @Test
    public void search3() throws InterruptedException, IOException {

        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[1]/input"))
                .sendKeys(username);
        Thread.sleep(4000);
        //enter my password into password box
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/form/fieldset[2]/input"))
                .sendKeys(password);
        driver.findElement(By.cssSelector(".red.SignupButton")).click();


        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);
        sequence.clickOnMensHealth();
    }

}
