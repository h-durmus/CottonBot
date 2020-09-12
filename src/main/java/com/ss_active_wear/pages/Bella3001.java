package com.ss_active_wear.pages;

import com.ss_active_wear.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class Bella3001 {

    protected WebDriverWait wait;
    protected Actions actions;

    @FindBy()
    private WebElement sPink;
    @FindBy()
    private WebElement mPink;
    @FindBy()
    private WebElement lPink;
    @FindBy()
    private WebElement sMauve;
    @FindBy()
    private WebElement mMauve;
    @FindBy()
    private WebElement lMauve;
    @FindBy()
    private WebElement sAutumn;
    @FindBy()
    private WebElement mAutumn;
    @FindBy()
    private WebElement lAutumn;


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

    public boolean alert_s_Pink(){return true;}

    public boolean alert_m_Pink(){return true;}

    public boolean alert_l_Pink(){return true;}

    public boolean alert_s_Mauve(){return true;}

    public boolean alert_m_Mauve(){return true;}

    public boolean alert_l_Mauve(){return true;}

    public boolean alert_s_Autumn(){return true;}

    public boolean alert_m_Autumn(){return true;}

    public boolean alert_l_Autumn(){return true;}

}
