package com.ss_active_wear.pages;

import com.ss_active_wear.utilities.ConfigurationReader;
import com.ss_active_wear.utilities.Driver;
import com.ss_active_wear.utilities.SSActiveWearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Heather colors page
 * */
public class Bella3001CVC {

    protected WebDriverWait wait;
    protected Actions actions;

    @FindBy(xpath = "//div[@id='c79567']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> athleticHeather;

    @FindBy(xpath = "//div[@id='c79569']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> darkGreyHeather;

    @FindBy(xpath = "//div[@id='c79587']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> heatherMaroon;

    @FindBy(xpath = "//div[@id='c79588']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> heatherMauve;

    @FindBy(xpath = "//div[@id='c79599']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> heatherPeach;

    @BeforeClass
    public void setup(){
        String URL = ConfigurationReader.getProperty("3001CVC");
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
