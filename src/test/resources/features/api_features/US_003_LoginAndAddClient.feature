Feature: As a user I should be login and Add new Client as Therapist
  @API
  Scenario: User logs in as Therapist

    Given the user logs in with Therapist credentials
    And the user adds new client with Api
    Then User verify that status code is 200
