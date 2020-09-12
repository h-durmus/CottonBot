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
 * Heather colors page
 * */
public class Bella3001CVC {

    protected WebDriverWait wait;
    protected Actions actions;

    @FindBy()
    private WebElement sHMaroon;
    @FindBy()
    private WebElement mHMaroon;
    @FindBy()
    private WebElement lHMaroon;
    @FindBy()
    private WebElement sHMauve;
    @FindBy()
    private WebElement mHMauve;
    @FindBy()
    private WebElement lHMauve;
    @FindBy()
    private WebElement sHPeach;
    @FindBy()
    private WebElement mHPeach;
    @FindBy()
    private WebElement lHPeach;


    @BeforeClass
    public void setup(){
        String URL = ConfigurationReader.getProperty("3001");
        Driver.getDriver().get(URL);
        wait = new WebDriverWait(Driver.getDriver(), 30);
        actions = new Actions(Driver.getDriver());
        SSActiveWearUtilities.viewAllColors();
    }

    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }

    public boolean alert_s_HMaroon(){return true;}

    public boolean alert_m_HMaroon(){return true;}

    public boolean alert_l_HMaroon(){return true;}

    public boolean alert_s_HMauve(){return true;}

    public boolean alert_m_HMauve(){return true;}

    public boolean alert_l_HMauve(){return true;}

    public boolean alert_s_HPeach(){return true;}

    public boolean alert_m_HPeach(){return true;}

    public boolean alert_l_HPeach(){return true;}

}
