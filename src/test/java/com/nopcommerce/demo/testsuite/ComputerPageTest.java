package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)

public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;


    @BeforeMethod
    public void inIt() {

        homePage= new HomePage();
        computerPage =new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }



    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        //Click on Computer tab
        homePage.selectTopMenu("Computers");
        //Verify "Computer" text
        Assert.assertEquals(computerPage.verifyComputersText(), "Computers", "Unable to verify text.");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        // Click on Computer tab
        homePage.selectTopMenu("Computers");
        // Click on Desktops link
        computerPage.selectFromSublist("Desktops");
        // Verify "Desktops" text
        Assert.assertEquals(desktopsPage.verifyDesktopsText(),"Desktops", "Unable to verify text.");
    }

    @Test(dataProvider = "Build Own Computer", dataProviderClass = TestData.class, groups = {"regression"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        // Click on Computer tab
        homePage.selectTopMenu("Computers");
        // Click on Desktops link
        computerPage.selectFromSublist("Desktops");
        // Click on product name "Build your own computer"
        desktopsPage.clickOnBuildYourOwnComputer();
        // Build your computer using test data class.
        buildYourOwnComputerPage.buildYourOwnComputer(processor, ram, hdd, os,software);
        // Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCartButton();
        //Verify message "The product has been added to your shopping cart"
        Assert.assertEquals(buildYourOwnComputerPage.verifyProductHasBeenAddedText(), "The product has been added to your shopping cart", "Unable to verify message.");



    }


}
