Feature: Testing on spencer purchasing functionality

@testcase1
Scenario Outline: Testing on spencer search functionality
Given user is able to access the application
When user is able to enter "<input>"
Then user is able to click on dairy and cart

Examples:
|input|
|Chocolate|
