# bddSauceDemo

Link Test Case Manual : https://docs.google.com/spreadsheets/d/1fwltuUeLuszmP3kA6GKKR_8hw4sEOCeq8CD3tQ2h9VQ/edit?usp=sharing


Feature: Login feature <br />
Scenario Outline: Test login with empty data<br />

Given I navigate to SauceDemo Homepage<br />
When I click Login Button <br />
Then I should be able to view error message <Error_message><br />

 Examples:<br />
 | Error_message | <br />
 | Epic sadface: Username is required |<br />


Feature: Validation Login feature <br />
Scenario Outline: Test login with username valid and password invalid data <br />

Given I navigate to SauceDemo Homepage <br />
When I fill username with <Username> and <Password> <br />
And I click Logins Button <br />
Then I should be able to see error message <Error_message> <br />

 Examples: <br />
 | Username | Password | Error_message | <br />
 | standard_user | Fo5J+rIy4FTbyuP5s8Po/Q== | Epic sadface: Username and password do not match any user in this service | <br />
 | locked_out_user | Fo5J+rIy4FTbyuP5s8Po/Q== | Epic sadface: Username and password do not match any user in this service |<br /> 
 | testing   | JltEQgaE0YE= | Epic sadface: Username and password do not match any user in this service |<br />
 | testing | qcu24s4901FyWDTwXGr6XA== | Epic sadface: Username and password do not match any user in this service |<br />
