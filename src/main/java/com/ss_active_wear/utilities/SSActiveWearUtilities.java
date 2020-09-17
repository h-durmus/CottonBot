package com.ss_active_wear.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    /**
     * checks if the count of t-shirts are equal to 0
     * if not equals to 0, returns false
     * @param color t-shirt color as List<WebElement>
     * @param size  t-shirt size
     * @return boolean if number is not 0, returns false
     * */
    public static boolean isThereAnyShirt(List<WebElement> color, String size){
        switch (size){
            case "extra small":
            case "xsmall":
            case "xs":
                if (!color.get(0).getText().equals("0")) return false;
            case "small":
            case "s":
                if (!color.get(1).getText().equals("0")) return false;
            case "medium":
            case "m":
                if (!color.get(2).getText().equals("0")) return false;
            case "large":
            case "l":
                if (!color.get(3).getText().equals("0")) return false;
            case "extra large":
            case "xlarge":
            case "xl":
                if (!color.get(4).getText().equals("0")) return false;
            case "2xlarge":
            case "2xl":
                if (!color.get(5).getText().equals("0")) return false;
            case "3xlarge":
            case "3xl":
                if (!color.get(6).getText().equals("0")) return false;
            case "4xlarge":
            case "4xl":
                if (!color.get(7).getText().equals("0")) return false;
            case "5xlarge":
            case "5xl":
                if (!color.get(8).getText().equals("0")) return false;
        }
        return true;
    }

}
