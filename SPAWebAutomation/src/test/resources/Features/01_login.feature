Feature: SPA SFBL Login

  @login
  Scenario Outline: Login with valid data
    Given user in the login page
    When user enter valid '<userName>' and '<password>'
    And click login button
    Then successfully navigate to the dashboard

    Examples:
      | userName    | password      |
      | fenitraders | fenitraders25 |