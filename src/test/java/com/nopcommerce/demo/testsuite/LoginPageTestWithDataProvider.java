package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTestWithDataProvider extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyErrorMessageWithInvalidCredentials(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username, password);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message not displayed");
    }
}
