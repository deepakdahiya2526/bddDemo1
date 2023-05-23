Feature: Test Login Functionality

<<<<<<< HEAD
Scenario Outline: Check login is successful with valid credentials
Given browser is open
And  user is on login page
When user enters "<username>" and "<password>"
And  user clicks on login
Then  user is navigated to home page


Examples:
| username | password |
| deepak   | 12345    |
| dahiya   | 12345    |
|dahiya2526|12345     |
=======
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And  user is on login page
    When user enters "<username>" and "<password>"
    And  user clicks on login
    Then  user is navigated to home page


    Examples:
      | username | password |
      | deepak   | 12345    |
      | dahiya   | 12345    |
>>>>>>> origin/master
