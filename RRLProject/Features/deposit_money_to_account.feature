Feature: Digital Bank Tests

Scenario: User signs in, creates a savings account, and deposits money
Given the user is on the login page
When the user enters their username and password and signs in
And the user creates a savings account with an initial deposit amount
And the user verifies the msg "Successfully created new Savings account named Meghana"
And the user deposits money into the account
And the deposit should be successful
Then the user verify the msg "Account Number: 486171165"