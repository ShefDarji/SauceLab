package org.example;

import org.openqa.selenium.By;

public class CameraCartPage extends Utils {


    //camera add to cart page to send email to refer
    public void referAFriend(){

        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
}
