package com.AmazonShopping.pages;

import com.AmazonShopping.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;


    @FindBy(id = "nav-cart-count")
    public WebElement itemChart;
}