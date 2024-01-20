Feature: Login Page

  Scenario: User logged successfully

  Background:
    Given Navigate to url
    When Enter Username
    And Enter Password
    Then Logged in successfully