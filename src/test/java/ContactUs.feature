@SmokeTest
  Feature: Contact Us test

    Scenario: Navigate to website and test Contact Us page

      Given I navigate to website
      Then I click on contact us button
      And I select Subject Heading
      Then I type an Email "hakandemir@gmail.com"
      And I type an order reference
      And I type a message
      When I attach a file
      And I click on send it button
      Then I verify success message
