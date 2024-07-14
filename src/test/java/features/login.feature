Feature: User Login

  Background:
    When User navigates to the Sign page

  Scenario: Validate user is able to go to login page
    Then User can see credencials form

  Scenario Outline: Validate user can login
    When User insert <username> and <password>
    And click on login
    Then User will see <size> shoes categories

    Examples:
      | username    | password | size |
      | abcdefg     | 12345    | 3    |
      | usertesting | 54321    | 3    |

