Feature: Testing register process

  Background:
    Given navigate to website
    And click on Sign in button
    Then type an "hakandemir@gmail.com"
    And click on Create an Account button

  Scenario: First Person
    When type firstname "Hakan" and lastname "Demir"
    And type a password "12345"

  Scenario: Second Person
    When type a company "BMW"
    Then type an address"Schiller Str. 3"

  Scenario Outline: Third Person
    When type firstname "<firstname>" and lastname "<lastname>"
    And type a password "<password>"
    And type a company "<company>"
    And type an address"<address>"
    Examples:
      | firstname | lastname | password | company | address       |
      | Third     | Person   | 09876    | Daimler | Göthe Str. 21 |
