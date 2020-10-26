package com.AmazonShopping.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShortCuts {
    public static String GetTitle(){
        return Driver.getDriver().getTitle();
    }

    public static String getText(WebElement element){
        return element.getText();
    }

    public static void staticWait(int timeInMileseconds){
        try{
            Thread.sleep(timeInMileseconds);
        }catch (Exception e){

        }
    }

    public static void waitTillClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitTillVisibility (WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static double priceConverterToDouble(String price){
        // System.out.println(price);
        double priceDouble=0.0;
        if(price.contains("$")){
            price=price.replace("$","");
            priceDouble=Double.valueOf(price);
        }
        else if(price.contains("€")){
            price=price.replace("€","");
            priceDouble=Double.valueOf(price);
        }

        return priceDouble;
    }


    public static void scroll(){
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }


    public static void manuelDropdown(WebElement dropdown, WebElement dropdownOptions, String parameter){
        dropdown.click();

    }

}
