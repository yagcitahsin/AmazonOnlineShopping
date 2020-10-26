package com.AmazonShopping.testScripts;

import com.AmazonShopping.pages.BasePage;
import com.AmazonShopping.pages.ItemPage;
import com.AmazonShopping.pages.SearchResultPage;
import com.AmazonShopping.pages.ShoppingChartPage;
import com.AmazonShopping.utilities.ShortCuts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class itemChartStepDefs {

    BasePage bp=new BasePage();
    SearchResultPage srp=new SearchResultPage();
    ItemPage ip=new ItemPage();
    ShoppingChartPage scp=new ShoppingChartPage();
    Select select;
    double priceManHats=0;
    int numberOfManHats=0;
    double priceWomenHats=0;
    int numberOfWomenHats=0;

    @Given("search for {string}")
    public void search_for(String itemName) {
        ShortCuts.waitTillClickable(bp.searchBox);
        bp.searchBox.sendKeys(itemName+ Keys.ENTER);
    }

    @Then("add number {int} item hat to Cart with quantity {int}")
    public void add_first_hat_to_Cart_with_quantity(int itemRow,int numberOfItem) {
        ShortCuts.waitTillClickable(srp.itemSelectorByNumber(itemRow));
        srp.itemSelectorByNumber(itemRow).click();
        if(bp.searchBox.getAttribute("value").contains("men")){
            numberOfManHats=numberOfItem;
            priceManHats=ShortCuts.priceConverterToDouble(ip.price.getText());
            select=new Select(ip.quantity);
            select.selectByValue(""+numberOfItem);
            ip.addToChartButton.click();
        }
        else if(bp.searchBox.getAttribute("value").contains("woman")){
            numberOfWomenHats=numberOfItem;
            priceWomenHats=ShortCuts.priceConverterToDouble(ip.price.getText());
            select=new Select(ip.quantity);
            select.selectByValue(""+numberOfItem);
            ip.addToChartButton.click();
        }
    }

    @Then("open cart and assert total price and quantity are correct")
    public void open_cart_and_assert_total_price_and_quantity_are_correct() {
        double actualTotalPrice;
        int totalQuantity=numberOfWomenHats+numberOfManHats;
        double expectedTotalPrice=(numberOfManHats*priceManHats)+(numberOfWomenHats*priceWomenHats);
        bp.itemChart.click();
        ShortCuts.waitTillVisibility(scp.totalItemNumber);
        Assert.assertTrue(scp.totalItemNumber.getText().contains(""+totalQuantity));
        ShortCuts.waitTillVisibility(scp.totalPrice);
        actualTotalPrice= ShortCuts.priceConverterToDouble(scp.totalPrice.getText());
        Assert.assertEquals(Math.round(expectedTotalPrice * 100.0) / 100.0,actualTotalPrice, 0.0);
    }

    @Then("change the quantity for {string} to {int} item")
    public void change_the_quantity_for_to_item(String itemName, int newQuantity) {
        if (itemName.contains("men")){
            numberOfManHats=newQuantity;
            scp.quantityDropdown(newQuantity+"");
        }
        else if(itemName.contains("woman")){
            numberOfWomenHats=newQuantity;
            scp.quantityDropdown(newQuantity+"");
        }
    }

    @Then("assert total price and quantity are changed correctly")
    public void assert_total_price_and_quantity_are_changed_correctly() {
        ShortCuts.waitTillVisibility(scp.totalPrice);
        ShortCuts.waitTillVisibility(scp.totalItemNumber);
        ShortCuts.staticWait(2000);
        double expectedTotalPrice=(numberOfManHats*priceManHats)+(numberOfWomenHats*priceWomenHats);
        double actualTotalPrice=ShortCuts.priceConverterToDouble(scp.totalPrice.getText());
        Assert.assertEquals(Math.round(expectedTotalPrice * 100.0) / 100.0,actualTotalPrice, 0.0);
        Assert.assertTrue(scp.totalItemNumber.getText().contains(""+(numberOfWomenHats+numberOfManHats)));
    }

}






