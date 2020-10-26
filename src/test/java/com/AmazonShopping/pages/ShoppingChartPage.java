package com.AmazonShopping.pages;

import com.AmazonShopping.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingChartPage extends BasePage {

    @FindBy(id = "sc-subtotal-label-activecart")
    public WebElement totalItemNumber;

    @FindBy(id = "sc-subtotal-amount-activecart")
    public WebElement totalPrice;

    public WebElement dropdownByQuantity(int quantity){
        WebElement dropdown= Driver.getDriver().findElement(By.xpath("//div[@data-quantity="+quantity+"]//select"));
        return dropdown;
    }

    public void quantityDropdown(String parameter){
        Driver.getDriver().findElement(By.xpath("//span[@id='a-autoid-2-announce']")).click();
        Driver.getDriver().findElement(By.xpath("//a[@id='dropdown1_"+parameter+"']")).click();

    }
}