Feature: Search by TRN no on View SavingAccounts

  Scenario: enter the TRN number on search box.
    Given the user is on the login page first
    When the user enters their valid user name  and valid password 
    And the user clicks the Sign In button
    And he is able  to click savings button
    And he select a view savings 
    And he search a TRN number
    Then he get TRN number successfully.