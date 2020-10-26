Feature: Item Chart

  @smoke
  Scenario: User should be able to add and delete items from item chart
    Given search for "hats for men"
    Then  add number 1 item hat to Cart with quantity 2
    And   open cart and assert total price and quantity are correct
    Then  search for "hats for woman"
    And   add number 1 item hat to Cart with quantity 1
    Then  open cart and assert total price and quantity are correct
    And   change the quantity for "hats for men" to 1 item
    Then  assert total price and quantity are changed correctly