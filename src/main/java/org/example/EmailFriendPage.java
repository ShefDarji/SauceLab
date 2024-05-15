package org.example;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils{
    LoadProp loadProp = new LoadProp();
    public void enterFriendDetails (){

        //enter friends email
        typeText(By.xpath("//input[@id='FriendEmail']"), loadProp.getProperty("friendEmail1")+randomDate()+ loadProp.getProperty("friendEmail2"));
        //my email id using random date as email is stored we do not type it again we just click on that
        clickOnElement(By.xpath("//input[@id='YourEmailAddress']"));
        //typeText(By.xpath("//input[@name='YourEmailAddress']"),"Laura"+randomDate()+"@yahoo.com");
        //type text on comment box
        typeText(By.xpath("//textarea[@name='PersonalMessage']"), loadProp.getProperty("referMsg"));
        //click on send email
        clickOnElement(By.name("send-email"));

    }
}
