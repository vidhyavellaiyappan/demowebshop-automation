package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;

public class LoginTest extends baseTest {

    @Test(dataProvider="loginData",dataProviderClass=DataProviderClass.class)
    public void loginTest(String Username,String Password) {

        LoginPage login = new LoginPage(driver);

        login.clickLogin();
        login.enterEmail(Username);
        login.enterPassword(Password);
        login.clickLoginBtn();

        String user = login.getLoggedInUser();

        Assert.assertEquals(user, Username);
    }
}