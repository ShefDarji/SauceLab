package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    //creating obj to user data from resources
    LoadProp loadProp = new LoadProp();

    //method to fill details on register page
    public void fillRegistrationDetails() {
        //type first name
        typeText(By.id("FirstName"), loadProp.getProperty("firstName"));

        //type second name
        typeText(By.id("LastName"), loadProp.getProperty("lastName"));

        //type DOB by value
        selectByValue(By.name("DateOfBirthDay"), loadProp.getProperty("dateOfBirth"));

        //type MOB by text
        selectByText(By.name("DateOfBirthMonth"), loadProp.getProperty("monthOfBirth"));

        //type YOB by value
        selectByValue(By.name("DateOfBirthYear"), loadProp.getProperty("yearOfBirth"));

        //type email id using random date
        typeText(By.name("Email"), loadProp.getProperty("emailPart1")+randomDate()+loadProp.getProperty("emailPart2"));

        //type password
        typeText(By.name("Password"), loadProp.getProperty("password"));

        //confirm password
        typeText(By.id("ConfirmPassword"), loadProp.getProperty("confirmPassword"));

        //click on register submit button
        clickOnElement(By.id("register-button"));


    }

}
