Feature: This is to test google search
Scenario: Google search Scenario
Given user is entering "google.co.in"
When user is trying the search term "mahi"
And enters the return key
Then the user should see the results