package com.ss_active_wear.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SSActiveWearUtilities {

    @FindBy(id = "M_M_zGridWarehouses")
    private static WebElement warehouses;

    @FindBy(id = "M_M_zGridColors")
    private static WebElement views;

    /**
     * select a warehouse
     * @param warehouse represents available warehouses
     * */
    public static void  selectWarehouse(String warehouse){
        Select warehouseDropdown = new Select( warehouses );
        warehouseDropdown.selectByVisibleText(warehouse);
    }

    /**
     * select viewing all colors at once
     * */
    public static void viewAllColors(){
        Select colorDropdown = new Select(views);
        colorDropdown.selectByVisibleText("All Colors");
    }

    /**
     * select a color and it will give the alphanumeric code
     * to place in xpath locator
     * */
    public static String colorCodes(String color){
        switch (color.toLowerCase().trim()){
            case "white":
                return "c30671";
            case "black":
                return "c30657";
            case "autumn":
            case "autumn orange":
                return "c67440";
            case "berry":
                return "c32571";
            case "dark gray":
            case "dark grey":
                return "c43541";
            case "kelly":
            case "kelly green":
                return "c30663";
            case "mauve":
                return "c66024";
            case "navy":
                return "c30666";
            case "pink":
                return "c39897";
            case "red":
                return "c32568";
            case "sunset":
                return "c66972";
            case "true royal":
            case "true royal blue":
                return "c30670";
            case "athletic heather":
                return "c79567";
            case "dark gray heather":
            case "dark grey heather":
                return "c79569";
            case "heather maroon":
                return "c79587";
            case "heather mauve":
                return "c79588";
            case "heather peach":
                return "c79599";
        }
        return "-1";
    }

}
