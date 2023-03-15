Feature: TestCase003

  Scenario: Ron Weasley checks his rupee account and withdraws X.
    Given I open Bank website
    When I click Customer Login category
    And I choose "Ron Weasly"
    And I click the login button
    And I choose account with number "1009"
    And I confirm currency "Rupee"
    And I check the account balance
    And I choose the category Withdrawl
    And I enter random amount
    And I click the button Withdraw
    And I check the transaction status
    Then I check the account balance after the transaction
    Then I close browser