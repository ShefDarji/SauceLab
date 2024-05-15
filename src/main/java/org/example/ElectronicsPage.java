package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{

    //click on camera page
    public void clickOnCameraCategory(){
        clickOnElement(By.xpath("//h2/a[@title=\"Show products in category Camera & photo\"]"));
    }

}
