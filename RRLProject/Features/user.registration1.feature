Feature: Registration Page

Scenario: A user must be able to register on the website
Given:  the user is on the website homepage
When the user clicks on the "SignupHere" button

And the user should be on the registration page
And the user enters the valid personal details
And he clicks on the register button
Then he should should verify- "Registration Successful. Please Login."
