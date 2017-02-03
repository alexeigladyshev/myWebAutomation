package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 2/3/2017.
 */
public class TestSignIn extends CommonAPI {

    @Test
    public void testSignInBlankCredentials(){

        Actions actions = new Actions(driver);
        //actions.moveToElement()
    }
}
