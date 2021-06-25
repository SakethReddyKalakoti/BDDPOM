Feature: CRM Login feature
Scenario: Valid Login scenario
Given User is already on Login Page
When User enters Login Credentials
    | username | pwd |
    | sakethreddy.kalakoti@gmail.com | Saketh@123 |
Then User is on Home Page
Then Close browser
    