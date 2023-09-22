Feature: Register
  i as services user, i need register in the web page

  Scenario Outline: register successful
    Given He user is on the page
    When He user enter the data for the register
      | username   | email   | password   |
      | <username> | <email> | <password> |
    Then he could see the name
    Examples:
      | username  | email              | password |
      | mbuitrago1 | maob24@yopmail.com | 1234     |
      | mbuitrago2 | maob25@yopmail.com | 1234     |
      | mbuitrago3 | maob26@yopmail.com | 1234     |
      | mbuitrago4 | maob27@yopmail.com | 1234     |

