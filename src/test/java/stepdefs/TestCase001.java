package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BankHomePage;
import pageobjects.CustomerAccountPage;
import pageobjects.CustomerListPage;

import static drivers.DriverFactory.getDriver;

public class TestCase001 {
    @Given("I open Bank website")
    public void iOpenBankWebsite() {
        BankHomePage.openBankWebsite();
        BankHomePage.assertHomePageUrl();
    }

    @When("I click Customer Login category")
    public void iClickCustomerLoginCategory() {
        BankHomePage.chooseCustomerLoginCategory();
    }

    @And("I choose {string}")
    public void iChoose(String customer_name) {
        CustomerListPage.chooseCustomer(customer_name);
    }


    @And("I click login button")
    public void iClickLoginButton() {
        CustomerListPage.loginCustomer();
        CustomerAccountPage.assertCustomerLoggedIn();
    }

    @And("I choose account with number {string}")
    public void iChooseAccountWithNumber(String account_number) {
        CustomerAccountPage.chooseAccount(account_number);
    }

    @And("I confirm currency {string}")
    public void iConfirmCurrency(String currency_name) {
        CustomerAccountPage.confirmCurrency(currency_name);
    }

    @And("I check customer account balance")
    public void iCheckCustomerAccountBalance() {
        CustomerAccountPage.checkAccountBalance();
    }

    @And("Funds available I choose the Withdrawal category")
    public void fundsAvailableIChooseTheWithdrawalCategory() {
        CustomerAccountPage.clickWithdrawlCategory();
    }

    @And("I enter the account balance amount")
    public void iEnterTheAccountBalanceAmount() {
        CustomerAccountPage.enterAccountBalanceAmount();
    }

    @And("I click the button Withdraw")
    public void iClickTheButtonWithdraw() {
        CustomerAccountPage.clickButtonWithdraw();
    }

    @And("I check the transaction status")
    public void iCheckTheTransactionStatus() {
        CustomerAccountPage.checkTransactionStatus();

    }

    @Then("I check the account balance after the transaction")
    public void iCheckTheAccountBalanceAfterTheTransaction() {
        CustomerAccountPage.checkAccountBalance();
    }


    @Then("I close browser")
    public void iCloseBrowser() {
        getDriver().quit();
    }
}
