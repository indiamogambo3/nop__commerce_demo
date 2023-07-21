package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']/li")
    List<WebElement> menuTop;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public void selectTopMenu(String topMenu) {

        Reporter.log("Select top menu." + topMenu + "from options" + topMenu.toString());
        CustomListeners.test.log(Status.PASS, "Select top menu." + topMenu);
        for (WebElement allMenu : menuTop) {
            if (allMenu.getText().equalsIgnoreCase(topMenu)) {
                clickOnElement(allMenu);
                break;
            }
        }
    }

    public void clickOnLoginLink() {
        Reporter.log("Click on login link." + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on login link.");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link." + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on register link.");
        clickOnElement(registerLink);
    }

    public boolean nopCommerceLogoIsDisplayed() {
        Reporter.log("Verify nopcommerce logo is displayed." + nopcommerceLogo.toString());
        CustomListeners.test.log(Status.PASS, "Verify nopcommerce logo is displayed.");
        return nopcommerceLogo.isDisplayed();
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Click on my account link." + myAccountLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on my account link.");
        clickOnElement(myAccountLink);
    }




    public String verifyLoginLinkIsDisplayed() {
        Reporter.log("Verify login link." + logout.toString());
        CustomListeners.test.log(Status.PASS, "Verify login link.");
        return getTextFromElement(loginLink);
    }


     }
