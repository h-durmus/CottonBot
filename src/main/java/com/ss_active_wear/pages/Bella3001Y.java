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
 * Youth size colors
 */
public class Bella3001Y {

    protected WebDriverWait wait;
    protected Actions actions;

    @FindBy()
    private WebElement sBerry;
    @FindBy()
    private WebElement mBerry;
    @FindBy()
    private WebElement lBerry;
    @FindBy()
    private WebElement sHMauve;
    @FindBy()
    private WebElement mHMauve;
    @FindBy()
    private WebElement lHMauve;
    @FindBy()
    private WebElement sBlack;
    @FindBy()
    private WebElement mBlack;
    @FindBy()
    private WebElement lBlack;


    @BeforeClass
    public void setup() {
        String URL = ConfigurationReader.getProperty("3001");
        Driver.getDriver().get(URL);
        wait = new WebDriverWait(Driver.getDriver(), 30);
        actions = new Actions(Driver.getDriver());
        SSActiveWearUtilities.viewAllColors();
    }

    @AfterClass
    public void teardown() {
        Driver.closeDriver();
    }

    public boolean alert_s_Berry() {
        return true;
    }

    public boolean alert_m_Berry() {
        return true;
    }

    public boolean alert_l_Berry() {
        return true;
    }

    public boolean alert_s_HMauve() {
        return true;
    }

    public boolean alert_m_HMauve() {
        return true;
    }

    public boolean alert_l_HMauve() {
        return true;
    }

    public boolean alert_s_Black() {
        return true;
    }

    public boolean alert_m_Black() {
        return true;
    }

    public boolean alert_l_Black() {
        return true;
    }

}
