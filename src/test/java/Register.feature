@RegressionTest
Feature: Register Test

  Scenario Outline: Create an account

    Given navigate to website
    And click on Sign in button
    Then type an "<Email>"
    And click on Create an Account button
    And choose a title
    Then type firstname "<firstname>" and lastname "<lastname>"
    And type a password "<password>"
    And type a company "<company>"
    And type an address"<address>"
    Examples:
      | Email                  | firstname | lastname | password    | company | address         |
      | hakandemir@gmail.com   | Hakan     | Demir    | Pass123     | Bosch   | Tübinger Str. 5 |
      | secondperson@gmail.com | Second    | Person   | password123 | BMW     | Schiller Str. 7 |
      | thirdperson@gmail.com  | Third     | Person   | 12344567    | Daimler | Göthe Str. 21   |
