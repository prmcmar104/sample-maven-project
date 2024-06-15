package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

//    By loginLink = By.linkText("Log in");

    @FindBy(linkText = "Register")
    WebElement registerLink;

//    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link " + loginLink.toString());
        clickOnElement(loginLink);

    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register Link " + registerLink.toString());
        clickOnElement(registerLink);
    }

}
