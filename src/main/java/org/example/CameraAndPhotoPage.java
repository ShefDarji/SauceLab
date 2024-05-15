package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils{

    //click on camera product which you want to refer
    public void clickOnCameraProduct(){
        clickOnElement(By.xpath("//div[@class=\"item-grid\"]//div[1]/div[1]/div[2]/div[3]/div[2]/button[@class='button-2 product-box-add-to-cart-button']"));
    }
}
