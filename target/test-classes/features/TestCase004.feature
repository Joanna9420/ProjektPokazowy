Feature: TestCase004

  Scenario:Bank manager creates user X and opens a dollar account. User X deposits amount X and checks transaction list.
    Given I open Banks website
    When I click the button Bank Manager Login
    And I click Add Customer Category
    And I enter a random name
    And I enter a random surname
    And I enter a random post code
    And I click Add Customer button
    And I confirm the creation of the user
    And I click Open Account Category
    And I select user X from the list
    And I choose the currency Dollar
    And I click the button Process
    And I confirm the account creation
    And I click the button Home
    And I click Customer Login category button
    And I choose from the list of users X
    And I click button login
    And I confirm the visibility of currency Dollar
    And I choose category Deposit
    And I enter a random amount
    And I click button Deposit
    And I check deposit status
    And I check account balance after transaction
    And I choose the category Transactions
    Then I confirm the visibility of the transaction