# bddSauceDemo

Feature: Login feature <br />
Scenario Outline: Test login with empty data<br />

Given I navigate to SauceDemo Homepage<br />
When I click Login Button <br />
Then I should be able to view error message <Error_message><br />

 Examples:<br />
 | Error_message | <br />
 | Epic sadface: Username is required |<br />
