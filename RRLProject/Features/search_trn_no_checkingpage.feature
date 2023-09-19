Feature: Banking Test

  Scenario: Search by TRN no on View Checking Accounts.
    Given the User is on the login page
    When the User enter the username and password 
    And  the User click on Checking and View Checking
    Then the User should enter the "TRN number: 845549182" on the search box