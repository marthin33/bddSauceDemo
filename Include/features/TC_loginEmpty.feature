Feature: Login feature
Scenario Outline: Test login with empty data

Given I navigate to SauceDemo Homepage
When I click Login Button 
Then I should be able to view error message <Error_message>

 Examples:
 | Error_message | 
 | Epic sadface: Username is required |
