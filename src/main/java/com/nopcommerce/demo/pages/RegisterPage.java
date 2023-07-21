package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;



    public String verifyRegisterText() {
        Reporter.log("Verify register text" + registerText.toString());
        CustomListeners.test.log(Status.PASS, "Verify register text");
        return getTextFromElement(registerText);
    }

    public void selectGender(String maleOrFemale) {
        Reporter.log("Select gender." + maleOrFemale + "radio button");
        CustomListeners.test.log(Status.PASS, "Select gender." + maleOrFemale);
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }

    public void enterFirstName(String firstName) {
        Reporter.log("Enter first name." + firstName + "in first name field" + firstNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name." + firstName);
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        Reporter.log("Enter last name." + lastName + "in last name field" + lastNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name." + lastName);
        sendTextToElement(lastNameField, lastName);
    }

    public void dateOfBirthDay(String day) {
        Reporter.log("Enter day for date of birth." + day + "in day field" + dateOfBirthDay.toString());
        CustomListeners.test.log(Status.PASS, "Enter day for date of birth." + day);
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        Reporter.log("Enter month for date of birth." + month + "in month field" + monthOfBirthDay.toString());
        CustomListeners.test.log(Status.PASS, "Enter month for date of birth." + month);
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
    }

    public void dateOfBirthYear(String year) {
        Reporter.log("Enter year for date of birth." + year + "in year field" + yearOfBirthDay.toString());
        CustomListeners.test.log(Status.PASS, "Enter year for date of birth." + year);
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
    }
    public void enterEmail(String email) {
        Reporter.log("Enter email." + email + "in email field" + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter email." + email);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password." + password + "in password field" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter password." + password);
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Enter confirm password." + confirmPassword + "in confirm password field" + confirmPasswordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter confirm password." + confirmPassword);
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on register button" + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on register button");
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        Reporter.log("Verify first name error" + firstNameError.toString());
        CustomListeners.test.log(Status.PASS, "Verify first name error");
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        Reporter.log("Verify last name error" + lastNameError.toString());
        CustomListeners.test.log(Status.PASS, "Verify last name error");
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        Reporter.log("Verify password error" + passwordError.toString());
        CustomListeners.test.log(Status.PASS, "Verify password error");
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        Reporter.log("Verify confirm password error" + confirmPasswordError.toString());
        CustomListeners.test.log(Status.PASS, "Verify confirm password error");
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        Reporter.log("Verify email error" + emailError.toString());
        CustomListeners.test.log(Status.PASS, "Verify email error");
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        Reporter.log("Verify registration complete message" + verifyRegistration.toString());
        CustomListeners.test.log(Status.PASS, "Verify registration complete message");
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        Reporter.log("Click on continue tab" + continueTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue tab");
        clickOnElement(continueTab);
    }

}
