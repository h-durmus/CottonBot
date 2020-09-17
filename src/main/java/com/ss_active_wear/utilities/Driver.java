package com.ss_active_wear.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){

        if (driver==null){
            String browser = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().browserVersion("78").setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    driver = new ChromeDriver(options);
                    break;
                case "chromeheadless":
                    WebDriverManager.chromedriver().browserVersion("81").setup();
                    ChromeOptions headlessOptions = new ChromeOptions();
                    headlessOptions.setHeadless(true);
                    driver = new ChromeDriver(headlessOptions);
                    break;
                default:
                    throw new RuntimeException("Only chrome at this time");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}
