package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;


import static helpers.CommonUtils.getWait;

public class TestCase004 {
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

    @And("I choose from the list of users X")
    public void iChooseFromTheListOfUsersX() {
        CustomerListPage.chooseNewCustomer();
    }


    @And("I confirm the visibility of currency Dollar")
    public void iConfirmTheVisibilityOfCurrencyDollar() {
        CustomerAccountPage.checkCurrentCurrency();
    }


    @And("I enter a random amount")
    public void iEnterARandomAmount() {
        CustomerAccountPage.enterRandomAmount();
    }

    @And("I choose the category Transactions")
    public void iChooseTheCategoryTransactions() {
        CustomerAccountPage.chooseTransactionCategory();
    }

    @Then("I confirm the visibility of the transaction")
    public void iConfirmTheVisibilityOfTheTransaction() {
        TransactionPage.assertTransationVisibility();

    }


}
