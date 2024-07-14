Feature: User Login

  Background:
    When User navigates to the Sign page

  Scenario: Validate user is able to go to login page
    Then User can see credencials form

  Scenario: Validate user can login
    When User insert credencials
    And click on login
    Then User will see 3 shoes categories

