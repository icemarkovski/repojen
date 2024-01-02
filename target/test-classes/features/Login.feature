Feature: Login functionality

Scenario: Login with valid credentials
Given I navigate to Login page
When I enter valid email adress into the email field
And I enter valid password into the pasword field
And Click on the Login button
Then I should successfuly logged in

Ctrl + / for commenting multiple lines in cucumber