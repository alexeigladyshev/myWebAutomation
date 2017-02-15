package Homepage;

import Base.CommonAPI;
import PageFactoryMain.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.yaml.snakeyaml.nodes.NodeId.sequence;

/**
 * Created by aleks_000 on 2/14/2017.
 */
public class TestPageFactory extends CommonMethods {


    @Test (priority = 1)
    public void search1() throws InterruptedException, IOException {

        performSignIn();

        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);
        sequence.clickOnBeauty();
    }

    @Test (priority = 2)
    public void search2() throws InterruptedException, IOException {

        performSignIn();

        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);
        sequence.clickOnHumor();
    }

    @Test (priority = 3)
    public void search3() throws InterruptedException, IOException {


        performSignIn();

        PageFactoryMain.PageFactorySearch sequence = PageFactory.initElements(driver, PageFactoryMain.PageFactorySearch.class);
        sequence.clickOnMensHealth();
    }

}
