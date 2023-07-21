package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement sortByDisplayDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    public String verifyDesktopsText() {
        Reporter.log("Verify desktops text." + desktopsText.toString());
        CustomListeners.test.log(Status.PASS, "Verify desktops text.");
        return getTextFromElement(desktopsText);
    }

    public void selectBySortBySortByDropDown(String sortBy) {
        Reporter.log("Select sort by from drop down." + sortBy + "from drop down" + sortByDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select sort by from drop down." + sortBy);
        selectByVisibleTextFromDropDown(sortByDropDown, sortBy);
    }

    public void selectByDisplayDropDown(String displayBy) {
        Reporter.log("Select display by from drop down." + displayBy + "from drop down" + sortByDisplayDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select display by from drop down." + displayBy);
        selectByVisibleTextFromDropDown(sortByDisplayDropDown, displayBy);
    }

    public void selectByProductList() {
        Reporter.log("Select by product list." + productList.toString());
        CustomListeners.test.log(Status.PASS, "Select by product list.");
        clickOnElement(productList);
    }

    public void clickOnBuildYourOwnComputer() {
        Reporter.log("Click on build your own computer." + buildYourOwnComputer.toString());
        CustomListeners.test.log(Status.PASS, "Click on build your own computer.");
        clickOnElement(buildYourOwnComputer);
    }


}
