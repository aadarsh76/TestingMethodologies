Feature: Free crm testing

Scenario Outline: Login page testing
Given user is on login page
When user enters "<username>" and "<password>"
Then user logged in succesfully
Then user clicks on contact setails
Then user fills details "<firstname>" and "<lastname>" and "<location>"

Examples:
| username | password   | firstname | lastname | location  |
| testerTT | tester@123 | Giver     | Taker    | Bangalore |
