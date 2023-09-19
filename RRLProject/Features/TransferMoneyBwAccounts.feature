Feature: Money Transfer Between Accounts

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
