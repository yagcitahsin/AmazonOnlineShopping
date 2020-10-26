$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/itemChart.feature");
formatter.feature({
  "name": "Item Chart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to add and delete items from item chart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "search for \"hats for men\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add number 1 item hat to Cart with quantity 2",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.add_first_hat_to_Cart_with_quantity(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open cart and assert total price and quantity are correct",
  "keyword": "And "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.open_cart_and_assert_total_price_and_quantity_are_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for \"hats for woman\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add number 1 item hat to Cart with quantity 1",
  "keyword": "And "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.add_first_hat_to_Cart_with_quantity(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open cart and assert total price and quantity are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.open_cart_and_assert_total_price_and_quantity_are_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "change the quantity for \"hats for men\" to 1 item",
  "keyword": "And "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.change_the_quantity_for_to_item(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "assert total price and quantity are changed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AmazonShopping.testScripts.itemChartStepDefs.assert_total_price_and_quantity_are_changed_correctly()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});