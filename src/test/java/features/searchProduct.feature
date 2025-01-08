@searchItem
Feature: Search and place the order for products
  Scenario Outline: Product search in both home and offers page
    Given user is on the GreenKart Landing page
    When user searched with short name <Name> and extracted actual name of the product
    Then user searched for <Name> short name in Top Deals page
    And validate product name in the Top Deals page matches with the Landing page
    Examples:
      |Name  |
      |Beet   |
      |Tom    |
