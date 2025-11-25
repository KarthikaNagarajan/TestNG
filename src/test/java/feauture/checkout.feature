@tag
Feature: user experience on search bar and top deals


    
   
  @placeorder 
  Scenario Outline: practice2
    Given user should be on practice landing page
    And search the product with short name <name> and extract the product name
    And Add "3" increments to the that product 
    And Navigate to the proceed checkout
   
   Examples:
   |name|
   |tom|
   
   