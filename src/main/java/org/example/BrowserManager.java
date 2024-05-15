package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    //obj to call load prop
    LoadProp loadProp = new LoadProp();
    //url for sauce lab
    String sauceLabUrl = "https://oauth-shefalidarji21-a1f7f:be3e3e6a-798d-473e-9dd6-42cdff186d2a@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    String browser = System.getProperty("browser");
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    public void openBrowser() {
        if (cloud) {
            System.out.println("Running on cloud");
            if (browser.equalsIgnoreCase("Chrome"))
            {

                System.out.println("Browser is Chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("122");

                try {
                    driver = new RemoteWebDriver(new URL(sauceLabUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (browser.equalsIgnoreCase("Firefox")) {

                System.out.println("Browser is Firefox");
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("125");

                try {
                    driver = new RemoteWebDriver(new URL(sauceLabUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (browser.equalsIgnoreCase("Edge"))
            {

                System.out.println("Browser is Edge");
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("123");

                try {
                    driver = new RemoteWebDriver(new URL(sauceLabUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (browser.equalsIgnoreCase("Safari"))
            {
                System.out.println("Browser is Safari");
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 10.15");
                browserOptions.setBrowserVersion("15");

                try {
                    driver = new RemoteWebDriver(new URL(sauceLabUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("Your browser is " + browser);
            }
        }
            else {
            System.out.println("Running on Local");
            if (browser.equalsIgnoreCase("Chrome")) {

                driver = new ChromeDriver();
                System.out.println("Your browser is Chrome");

            }  //if firefox it will enter this loop
            else if (browser.equalsIgnoreCase("Firefox")) {

                driver = new FirefoxDriver();
                System.out.println("Browser is Firefox");

            }//if edge it will enter this loop
            else if (browser.equalsIgnoreCase("Edge")) {

                driver = new EdgeDriver();
                System.out.println("Browser is Edge");

            }//if safari it will enter this loop
            else if (browser.equalsIgnoreCase("Safari")) {

                driver = new SafariDriver();
                System.out.println("Browser is Safari");

            }//if none of the above it will enter this loop i.e any other browser
            else {
                System.out.println("Your browser is " + browser);
            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }

    //method to close the windows
    public void closeBrowser() {

        driver.quit();
    }

}