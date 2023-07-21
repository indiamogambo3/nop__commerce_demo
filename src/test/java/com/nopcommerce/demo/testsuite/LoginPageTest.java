package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {


    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {

        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {

        //Click on login link
        homePage.clickOnLoginLink();
        //verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.verifyWelcomeText(), "Welcome, Please Sign In!", "Unable to verify text.");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {

        // Click on login link
        homePage.clickOnLoginLink();
        // Enter EmailId
        loginPage.enterEmail("Mogm123@gmail.com");
        // Enter Password
        loginPage.enterPassword("mogm1234");
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify that the Error message
        Assert.assertEquals(loginPage.verifyErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Unable to verify message");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {

        // Click on login link
        homePage.clickOnLoginLink();
        // Enter EmailId
        loginPage.enterEmail("Mukz123@gmail.com");
        // Enter Password
        loginPage.enterPassword("mukz1234");
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify that LogOut link is display
        Assert.assertEquals(loginPage.verifyLogoutLinkIsDisplayed(), "Log out", "Unable to verify link.");
    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {

        // Click on login link
        homePage.clickOnLoginLink();
        // Enter EmailId
        loginPage.enterEmail("Mukz123@gmail.com");
        // Enter Password
        loginPage.enterPassword("mukz1234");
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Click on LogOut Link
        loginPage.clickOnLogoutLink();
        // Verify that LogIn Link Display
//        Assert.assertEquals(homePage.verifyLoginLinkIsDisplayed(), "Log in", "Unable to verify link.");

    }










}
