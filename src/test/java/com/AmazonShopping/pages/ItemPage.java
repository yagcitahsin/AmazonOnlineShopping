package com.AmazonShopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {


    @FindBy(id = "price_inside_buybox")
    public WebElement price;

    @FindBy(id = "quantity")
    public WebElement quantity;


    @FindBy(id = "add-to-cart-button")
    public WebElement addToChartButton;

    @FindBy(id = "a-autoid-44-announce")
    public WebElement manuelQuantity;




}