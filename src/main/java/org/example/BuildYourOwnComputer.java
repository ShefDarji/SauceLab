package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
    LoadProp loadProp = new LoadProp();
    public void buildYourOwnComputer(){
//select second drop down from RAM
        selectByValue(By.name("product_attribute_2"), loadProp.getProperty("ram"));
//select second drop down for HDD
        clickOnElement(By.xpath("//input[@id='product_attribute_3_7']"));
//select second option for OS
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
//select second option for Software
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
//click on add to cart
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
//to click green tab on top of the button we need to wait for few second
        elementToBeClickable(By.xpath("//div[@class='bar-notification success']"));
//click on shopping cart on that green tab
        clickOnElement(By.xpath("//p/a['shopping cart']"));


    }


}
