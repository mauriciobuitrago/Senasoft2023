Feature: login

  Scenario Outline: Login Sucessfull
    Given He user is on the page
    When He user enter the credentials
      | email   | password   |
      | <email> | <password> |
    Then he could see the name
    Examples:
      | email              | password |
      | maob24@yopmail.com | 1234     |
      | maob25@yopmail.com | 1234     |