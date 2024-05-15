package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    //method for clicking actions
    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    //method to type text
    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyMMddhhmm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //to get or store text
    public static String getText(By by) {

        return driver.findElement(by).getText();
    }

    //method to select drop down by Value
    public static void selectByValue(By by, String text) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //method to select drop down by Text
    public static void selectByText(By by, String text) {

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //method to select drop down by Index
    public static void selectByIndex(By by, int index) {

        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //method to use Explicit Wait 1
    public static void elementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));

    }

    //method to use Explicit Wait 2
    public static void elementToBe(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //method to use Explicit Wait 3
    public static void visibilityOfElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //method to use Explicit Wait 4
    public static void elementToSelect(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    //method to use Explicit wait 5
    public static void invisibilityOfElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //method to use Explicit wait 6
    public static void elementToBeSelected(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    //method to use Explicit wait 7
    public static void frameToBeAvailable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebDriver element = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }

    //method to use Explicit wait 8
    public static void visibilityOfAllElementsLocatedBy(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    //method to use Explicit wait 9
    public static void alertIsPresent(int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        WebDriver element = (WebDriver) wait.until(
                ExpectedConditions.alertIsPresent());
    }

    //sleep method
    public static void sleepMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void takeSnapShot(String text) {
    //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
    //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    //Move image file to new destination
    //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src/ScreenShot/" + text + randomDate() + ".png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
