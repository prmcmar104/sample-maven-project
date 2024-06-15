package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTestWithParameterAndParallel extends Utility {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    @Parameters("browserName")
    public void setUp(String browser){
        selectBrowser(browser);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
