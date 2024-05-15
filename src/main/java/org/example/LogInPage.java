package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils {

    public void logIn(){
        //type log in id
        typeText(By.className("email"),"Laura"+randomDate()+"@yahoo.com");

        //type password
        typeText(By.className("password"),"1234567");

        //click on enter to log in
        clickOnElement(By.xpath("//button[normalize-space()='Log in']"));
    }

}
