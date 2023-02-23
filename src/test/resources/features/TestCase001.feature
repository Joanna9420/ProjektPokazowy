Feature: TestCase001

  Scenario: Hermione Granger checks the account balance in dollars and if there is anything, she withdraws everything
    Given I open Bank website
    When I click Customer Login category
    And I choose "Hermoine Granger"
    And I click login button
    And I choose account with number "1001"
    And I confirm currency "Dollar"
    And I check customer account balance
    And Funds available I choose the Withdrawal category
    And I enter the account balance amount
    And I click the button Withdraw
    And I check the transaction status
    Then I check the account balance after the transaction
    Then I close browser