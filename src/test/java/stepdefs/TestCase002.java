package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BankHomePage;
import pageobjects.CustomerAccountPage;
import pageobjects.CustomerListPage;

import static drivers.DriverFactory.driver;
import static selectors.CustomerListPageSelectors.*;

public class TestCase002 {
    @Given("I open a Bank website")
    public void iOpenABankWebsite() {
        BankHomePage.openBankWebsite();
        BankHomePage.assertHomePageUrl();
    }

    @When("I click a Customer Login category")
    public void iAClickCustomerLoginCategory() {
        BankHomePage.chooseCustomerLoginCategory();
    }

    @And("I click a login button")
    public void iClickALoginButton() {
        CustomerListPage.loginCustomer();
        CustomerAccountPage.assertCustomerLoggedIn();
    }

    @And("I check account balance")
    public void iCheckAccountBalance() {
        CustomerAccountPage.checkAccountBalance();
    }

    @And("I choose the category Deposit")
    public void iChooseTheCategoryDeposit() {
        CustomerAccountPage.chooseDepositCategory();
    }

    @And("I enter the random amount")
    public void iEnterTheRandomAmount() {
        CustomerAccountPage.enterRandomAmount();
    }

    @And("I click the button Deposit")
    public void iClickTheButtonDeposit() {
        CustomerAccountPage.clickButtonDeposit();
    }

    @And("I check the deposit status")
    public void iCheckTheDepositStatus() {
        CustomerAccountPage.checkDepositStatus();
    }

    @Then("I check the account balance after transaction")
    public void iCheckTheAccountBalanceAfterTransaction() {
        CustomerAccountPage.checkAccountBalance();
        driver.quit();
    }
}
