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

}
