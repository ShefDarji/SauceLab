package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    //method to click on Register button on homepage
    public void clickOnRegisterButton(){

        clickOnElement(By.className("ico-register"));
    }

    //click on Login Page
    public void clickOnLogIn(){

        clickOnElement(By.className("ico-login"));
    }

    //Click on electronics page
    public void clickOnElectronics(){
        clickOnElement(By.xpath("//h2[@class='title']/a[@title=\"Show products in category Electronics\"]"));

    }

    //click on build your own computer on homepage
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[2]/div[1]/div[1]/div[1]/a[@title='Show details for Build your own computer']"));
    }


}
