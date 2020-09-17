package com.ss_active_wear.pages;

import com.ss_active_wear.utilities.ConfigurationReader;
import com.ss_active_wear.utilities.Driver;
import com.ss_active_wear.utilities.SSActiveWearUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Toddler size colors
 * */
public class Bella3001T {

    protected WebDriverWait wait;
    protected Actions actions;

    @BeforeClass
    public void setup(){
        String URL = ConfigurationReader.getProperty("3001T");
        Driver.getDriver().get(URL);
        wait = new WebDriverWait(Driver.getDriver(), 30);
        actions = new Actions(Driver.getDriver());
        SSActiveWearUtilities.viewAllColors();
    }

    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }

}
