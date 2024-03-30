Feature: User Login
  As a user
  I want to log in with client credentials
  So that I can access my account
  @UI
  Scenario: User logs in with client credentials
    Given the user is on the home page
    When the user logs in with client credentials
    And Login successfully message should be visible
    Then the user should be logged in successfully