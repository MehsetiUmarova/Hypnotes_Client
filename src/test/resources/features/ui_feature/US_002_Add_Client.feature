Feature: Add Client

  @UI @TC001
  Scenario Outline:User enters invalid firstName
    Given the user is on the home page
    And the user logs in with client credentials
    When the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enters invalid first name "<firstName>"
    Then the user verifies that firstname and lastname alerts are visible

    Examples:
      | firstName |
      | M         |
      | Mehseti1  |
      | Mehseti / |

  @UI @TC002
  Scenario Outline: User enters invalid lastname
    Given the user is on the home page
    And the user logs in with client credentials
    When the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enters invalid last name "<lastName>"
    Then the user verifies that firstname and lastname alerts are visible

    Examples:
      | lastName |
      | U        |
      | Umarli1  |
      | Umarli ? |

  @UI @TC003
  Scenario Outline: User enters invalid email
    Given the user is on the home page
    And the user logs in with client credentials
    When the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enters invalid "<email>"
    Then the user verifies that email alert is visible
    Examples:
      | email              |
      | Mehseti.@gmail.com |
      | Umarli,@gmail.com  |
      | Umarli:@gmail.com  |


  @UI @TC004
  Scenario: The user enters valid information and click save button
    Given the user is on the home page
    And the user logs in with client credentials
    When the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enters valid firstname
    And the user enters valid lastname
    And the user enters valid email
    And the user clicks save button
    And the user confirm the selected Time Zone
    Then the user verify that successfully added message is visible
