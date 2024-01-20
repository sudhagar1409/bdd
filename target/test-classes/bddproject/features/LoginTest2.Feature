Feature: Login Page

  Scenario: User logged successfully

  Background:
    Given Navigate to url

    When Enter Username as 'DemoCSR'
    And Enter Password as 'crmsfa'
    Then Logged in successfully