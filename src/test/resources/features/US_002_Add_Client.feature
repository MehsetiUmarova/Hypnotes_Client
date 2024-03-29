Feature: Add Client
  @UI @TC001
  Scenario:The user enters invalid firstName
    Given user goes to home page
   When the user login with Therapist credentials
    Then the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enters invalid firstName
    Then the user verifies that firstname or lastname alerts is visible alert

  @UI @TC002
    Scenario: The user enter invalid lastname
    Given user goes to home page
    When the user login with Therapist credentials
    Then the user clicks on the Clients button
    And the user clicks on the Add Client button
    And the user enter invalid lastname
    Then the user verifies that firstname or lastname alerts is visible alert
