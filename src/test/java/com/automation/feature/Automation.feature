Feature: Testing login function on Automation app

Background:
Given user to launch the browser
Then user to launch the application

@Signin
Scenario Outline: User checking the login function using valid username and valid password.
Given user clicks on Signin button
When user enters the valid username "<username>" in the username field
And User enters valid password "<password>" in the password field
And user clicks on login button
Then User confirms the home page is launched.

Examples:
|username|password|
|uma2011@yahoo.com|sakthi|


Scenario: user selects tshirt to place order
Given user navigates to tshirt in women option
When user clicks on tshirt image to book	
And user selects quantity of tshirt
And user selects size of tshirt
And user selects colour of tshirt
And user adds tshirt to cart
And user proceeds to checkout
Then user confirms tshirt checkout


Scenario: User completes order
Given user proceeds to shipping page
And user agrees to terms of service
And User proceeds to payment page
And user selects to bankwire
Then User confirms order.
