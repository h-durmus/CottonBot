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

}
