

Feature: Application login
  I want to use this template for my feature file
  
  Background:
 
  When launch the browser from config value
  And hit the home page of url landing page
  
  
 @SmokeTest @Netbanking
Scenario: Admin page default login
    Given user is on netbanking login page
    When user login into application with user143 and passcode
    And Home page should display
    Then cards are displayed

@Regression @HDFC
Scenario: Admin page default login
    Given user is on netbanking login page
    When user login into application with "charan143" and passcode789
    And Home page should display
    Then cards are displayed



 @SmokeTest  @Regression
Scenario Outline: Admin Admin page default login
    Given user is on netbanking login page
    When user login into application with <user> and <pass> 
    And Home page should display
    Then cards are displayed
Examples:
|user|pass|
|credit|1234|
|debit|345|

@Regression
Scenario: 
    Given practice landing page should be displayed
    When enter the sign up details
    |venkatesh|
    |7989139538|
    |karthika|
    |Good pair|
    When click on sigh up button

    
    
    


  

  
 