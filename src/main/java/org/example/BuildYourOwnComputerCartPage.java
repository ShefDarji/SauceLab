package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputerCartPage extends Utils {
    LoadProp loadProp = new LoadProp();
    public void rightProductAdded() {
        //on the cart page need to check if name of product in cart is matching to the actual product
        String expectedMsg = "Build your own computer";
        String actualMsg = getText(By.className("product-name"));

        //verify actual = expected
        Assert.assertEquals(actualMsg, expectedMsg, loadProp.getProperty("computerCartPage"));

    }
}