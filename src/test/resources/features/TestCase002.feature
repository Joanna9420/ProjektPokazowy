Feature: TestCase002

  Scenario: Harry Potter checks the balance in pounds and deposits the amount X.
    Given I open Bank website
    When I click Customer Login category
    And I choose "Harry Potter"
    And I click login button
    And I choose account with number "1005"
    And I confirm currency "Pound"
    And I check account balance
    And I choose the category Deposit
    And I enter the random amount
    And I click the button Deposit
    And I check the deposit status
    Then I check the account balance after the transaction
    Then I close browser