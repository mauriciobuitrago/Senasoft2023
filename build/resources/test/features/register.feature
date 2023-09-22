Feature: Register
  i as services user, i need register in the web page

  Scenario: register successful
    Given He user is on the page
    When He user enter the data for the register
    Then he could see the name
