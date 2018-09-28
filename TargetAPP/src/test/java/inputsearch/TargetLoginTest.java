package inputsearch;

import HomePageTarget.TargetLogin;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetLoginTest extends TargetLogin {

    TargetLogin ObjTargetLogin;

    @BeforeMethod

    public void init() {
        ObjTargetLogin = new TargetLogin(driver);
    }
    @Test
    public void ClickOnTargetLoginF(){
        clickOnTargetLogin();
    }
    @Test
    public void EnterPassWordF(){
        clickOnEnterEmailOrMobile();
    }
    @Test
    public void RecoverPasswordF(){
        clickOnForgotPassWord();
    }
}
