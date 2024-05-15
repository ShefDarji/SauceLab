
package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LogInPage logInPage = new LogInPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    CameraCartPage cameraCartPage = new CameraCartPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    BuildYourOwnComputerCartPage buildYourOwnComputerCartPage = new BuildYourOwnComputerCartPage();



    @Test
    public void verifyUserShouldSuccessfullyRegister(){
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
    }

    @Test
    public void verifyRegisteredUserShouldLoginAndReferAFriend(){
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
        //once registered User should log in from homepage
        //homePage.clickOnLogIn();
        //enter login details on login page
        // logInPage.logIn();
        //click on electronics on homepage
        homePage.clickOnElectronics();
        //click on camera category
        electronicsPage.clickOnCameraCategory();
        //click on the product to refer from camera page
        cameraAndPhotoPage.clickOnCameraProduct();
        //Add the product in cart
        cameraCartPage.referAFriend();
        //send email to friend
        emailFriendPage.enterFriendDetails();

    }

    @Test
    public void toVerifyUserShouldAddMakeYourOwnComputer(){
        //click on make you own computer on home page
        homePage.clickOnBuildYourOwnComputer();
        //fill the details for make your own computer
        buildYourOwnComputer.buildYourOwnComputer();
        //go on cart page and verify right product is added
        buildYourOwnComputerCartPage.rightProductAdded();
    }



}
