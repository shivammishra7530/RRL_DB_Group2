Feature: Registration Page

Scenario: A user must be able to register on the website
Given:  the user is on the website homepage
When the user clicks on the "SignupHere" button

And the user should be on the registration page
And the user enters the valid personal details
And he clicks on the register button
Then he should should verify- "Registration Successful. Please Login."


Scenario: Login credentials scenario 
    Given I am on the login page
    When I enter username and password 
    And I click the login button
    Then I get logged in successfully
    
    Scenario: User signs in, creates a savings account, and deposits money
Given the user is on the login page
When the user enters their username and password and signs in
And the user creates a savings account with an initial deposit amount
And the user verifies the msg "Successfully created new Savings account named Meghana"
And the user deposits money into the account
And the deposit should be successful
Then the user verify the msg "Account Number: 486171165"


 Scenario: User must be able to Withdraw from their account
    Given the User is on the home page
    When the User clicks on savings  and create account  
    And the User verify-"Successfully created new Savings account named John"
    And the User clicks on withdraw and withdrawls the money
    Then the User should Verify-"Interest Rate: 0.0%"
    
    Scenario: User transfers funds from one account to another
     Given a user is on the Log In Page of the Website
  When the user enters all the correct credentials and clicks on SIGN IN
  And the login is successful, and a welcome message is displayed
  And the User clicks on Transfer Between Accounts
  And they select the From Account from the Dropdown
  And they select the To Account from the Dropdown
  And they enter the amount
  And they click on the submit button
  Then they verify the message of successful transfer
  
  
  Scenario: A user must able to Direct payment to VISA
Given is user on Landing Page
When he clicks on the VISA Direct Transfer
And he select a VISA Account Number
And he enter the transfer Amount
Then click Submit to VISA successfully.


Scenario: Search by TRN no on View Checking Accounts.
    Given the User is on the login page
    When the User enter the username and password 
    And  the User click on Checking and View Checking
    Then the User should enter the "TRN number: 845549182" on the search box
    
    
    
    Scenario: enter the TRN number on search box.
    Given the user is on the login page first
    When the user enters their valid user name  and valid password 
    And the user clicks the Sign In button
    And he is able  to click savings button
    And he select a view savings 
    And he search a TRN number
    Then he get TRN number successfully.