@placeOrder
Feature: Place the order for products
  Scenario Outline: Checkout and place order for the products
    Given user is on the GreenKart Landing page
    When user searched with short name <Name> and extracted actual name of the product
    And added "3" items of selected product to cart
    Then user proceeds to checkout and validate <Name> items in the checkout page
    And user has ability to enter promo code and place the order

    Examples:
      | Name |
      | Tom  |