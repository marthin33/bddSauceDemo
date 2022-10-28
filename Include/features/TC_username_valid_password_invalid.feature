Feature: Validation Login feature
Scenario Outline: Test login with username valid and password invalid data

Given I navigate to SauceDemo Homepage
When I fill username with <Username> and <Password>
And I click Logins Button
Then I should be able to see error message <Error_message>

 Examples:
 | Username | Password | Error_message |
 | standard_user | Fo5J+rIy4FTbyuP5s8Po/Q== | Epic sadface: Username and password do not match any user in this service |
 | locked_out_user | Fo5J+rIy4FTbyuP5s8Po/Q== | Epic sadface: Username and password do not match any user in this service |
 | testing   | JltEQgaE0YE= | Epic sadface: Username and password do not match any user in this service |
 | testing | qcu24s4901FyWDTwXGr6XA== | Epic sadface: Username and password do not match any user in this service |