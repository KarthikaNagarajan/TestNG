
@tag
Feature: user experience on search bar and top deals


    
    
  @basic
  Scenario Outline: practice2
    Given user should be on practice landing page
    And search the product with short name <name> and extract the product name
    When check the extract product name by search <name> shortname in Top deals
    And Quit the driver
   Examples:
   |name|
   |tom|
   |brin|
   |cucu|
  
    

 	