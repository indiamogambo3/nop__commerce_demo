package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public String verifyWelcomeText() {
        Reporter.log("Verify welcome text" + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Verify welcome text");
        return getTextFromElement(welcomeText);
    }
    public void enterEmail(String email) {
        Reporter.log("Enter email." + email + "in email field" + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter email." + email);
        sendTextToElement(emailField, email);


    }

    public void enterPassword(String password) {
        Reporter.log("Enter password." + password + "in email field" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter password." + password);
        sendTextToElement(passwordField, password);


    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login button" + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on login button");
        clickOnElement(loginButton);


    }

    public String verifyErrorMessage() {
        Reporter.log("Verify error message" + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify error message");
        return getTextFromElement(errorMessage);
    }

    public String verifyLogoutLinkIsDisplayed() {
        Reporter.log("Verify logout link." + logout.toString());
        CustomListeners.test.log(Status.PASS, "Verify logout link.");
        return getTextFromElement(logout);
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on logout link." + logout.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout link.");
        clickOnElement(logout);
    }



}
