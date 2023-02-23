package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;

import static drivers.DriverFactory.driver;

public class TestCase004 {
    @Given("I open Banks website")
    public void iOpenBanksWebsite() {
        BankHomePage.openBankWebsite();
        BankHomePage.assertHomePageUrl();
    }

    @When("I click the button Bank Manager Login")
    public void iClickTheButtonBankManagerLogin() {
        BankHomePage.chooseManagerLoginCategory();
        BankManagerPage.assertBankManagerLogin();
    }

    @And("I click Add Customer Category")
    public void iClickAddCustomerCategory() {
        BankManagerPage.addNewCustomer();
        AddCustomerPage.assertAddCustomerPage();
    }

    @And("I enter a random name")
    public void iEnterARandomName() {
        AddCustomerPage.enterRandomName();
    }

    @And("I enter a random surname")
    public void iEnterARandomSurname() {
        AddCustomerPage.enterRandomSurname();
    }

    @And("I enter a random post code")
    public void iEnterARandomPostCode() {
        AddCustomerPage.enterRandomPostCode();
    }

    @And("I click Add Customer button")
    public void iClickAddCustomerButton() {
        AddCustomerPage.createNewCustomer();
    }

    @And("I confirm the creation of the user")
    public void iConfirmTheCreationOfTheUser() {
        AddCustomerPage.confirmNewCustomer();
    }

    @And("I click Open Account Category")
    public void iClickOpenAccountCategory() {
        AddCustomerPage.openNewAccount();
        OpenAccountPage.assertOpenAccountPage();
    }

    @And("I select user X from the list")
    public void iSelectUserXFromTheList() {
        OpenAccountPage.chooseNewCustomer();
    }

    @And("I choose the currency Dollar")
    public void iChooseTheCurrencyDollar() {
        OpenAccountPage.pickDollarCurrency();
    }

    @And("I click the button Process")
    public void iClickTheButtonProcess() {
        OpenAccountPage.openNewAccount();
    }

    @And("I confirm the account creation")
    public void iConfirmTheAccountCreation() {
        OpenAccountPage.confirmOpenedNewAccount();
    }

    @And("I click the button Home")
    public void iClickTheButtonHome() {
        OpenAccountPage.backToHomePage();
        BankHomePage.assertHomePageUrl();
    }

    @And("I click Customer Login category button")
    public void iClickCustomerLoginCategoryButton() {
        BankHomePage.chooseCustomerLoginCategory();
    }

    @And("I choose from the list of users X")
    public void iChooseFromTheListOfUsersX() {
        CustomerListPage.chooseNewCustomer();
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        CustomerListPage.loginCustomer();
        CustomerAccountPage.assertCustomerLoggedIn();
    }

    @And("I confirm the visibility of currency Dollar")
    public void iConfirmTheVisibilityOfCurrencyDollar() {
        CustomerAccountPage.checkCurrentCurrency();
    }

    @And("I choose category Deposit")
    public void iChooseCategoryDeposit() {
        CustomerAccountPage.chooseDepositCategory();
    }

    @And("I enter a random amount")
    public void iEnterARandomAmount() {
        CustomerAccountPage.enterRandomAmount();
    }

    @And("I click button Deposit")
    public void iClickButtonDeposit() {
        CustomerAccountPage.clickButtonDeposit();
    }

    @And("I check deposit status")
    public void iCheckDepositStatus() {
        CustomerAccountPage.checkDepositStatus();
    }

    @Then("I check account balance after transaction")
    public void iCheckAccountBalanceAfterTransaction() {
        CustomerAccountPage.checkAccountBalance();
    }


    @And("I choose the category Transactions")
    public void iChooseTheCategoryTransactions() {
        CustomerAccountPage.chooseTransactionCategory();
    }

    @Then("I confirm the visibility of the transaction")
    public void iConfirmTheVisibilityOfTheTransaction() {
        TransactionPage.assertTransationVisibility();
        driver.quit();
    }


}
