package com.ss_active_wear.pages;

import com.ss_active_wear.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;


public class Bella3001 {

    protected WebDriverWait wait;
    protected Actions actions;

    @FindBy(xpath = "//div[@id='c30671']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> white;

    @FindBy(xpath = "//div[@id='c30657']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> black;

    @FindBy(xpath = "//div[@id='c67440']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> autumn;

    @FindBy(xpath = "//div[@id='c32571']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> berry;

    @FindBy(xpath = "//div[@id='c43541']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> darkGrey;

    @FindBy(xpath = "//div[@id='c30663']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> kellyGreen;

    @FindBy(xpath = "//div[@id='c66024']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> mauve;

    @FindBy(xpath = "//div[@id='c30666']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> navy;

    @FindBy(xpath = "//div[@id='c39897']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> pink;

    @FindBy(xpath = "//div[@id='c32568']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> red;

    @FindBy(xpath = "//div[@id='c66972']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> sunset;

    @FindBy(xpath = "//div[@id='c30670']//div[@class='gR']//div[@class='i']//span[4]")
    private List<WebElement> trueRoyal;

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

    @Test
    public void shirtCheck(){
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) white));
        Assert.assertTrue(SSActiveWearUtilities.isThereAnyShirt(white, "s"));
    }

}
