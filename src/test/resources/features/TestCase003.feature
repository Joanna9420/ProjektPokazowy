Feature: TestCase003

  Scenario: Ron Weasley checks his rupee account and withdraws X.
    Given I open the Bank website
    When I click the Customer Login category
    And I choose "Ron Weasley"
    And I click the login button
    And I choose account with number "1009"
    And I confirm currency "Rupee"
    And I check the account balance
    And I choose the category Withdrawl
    And I enter random amount
    And I click button Withdraw
    And I check transaction status
    Then I check account balance after the transaction