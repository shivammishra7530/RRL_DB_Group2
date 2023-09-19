Feature: Withdraw money from an account
  Scenario: User must be able to Withdraw from their account
    Given the User is on the home page
    When the User clicks on savings  and create account  
    And the User verify-"Successfully created new Savings account named John"
    And the User clicks on withdraw and withdrawls the money
    Then the User should Verify-"Interest Rate: 0.0%"
    
   