package stepdefs;

import io.cucumber.java.en.And;
import pageobjects.CustomerAccountPage;
import pageobjects.CustomerListPage;



public class TestCase003 {

    @And("I click the login button")
    public void iClickTheLoginButton() {
        CustomerListPage.loginCustomer();
        CustomerAccountPage.assertCustomerLoggedIn();
    }

    @And("I check the account balance")
    public void iCheckTheAccountBalance() {
        CustomerAccountPage.checkAccountBalance();
    }
    @And("I choose the category Withdrawl")
    public void iChooseTheCategoryWithdrawl() {
        CustomerAccountPage.chooseWithdrawlCategory();
    }
    @And("I enter random amount")
    public void iEnterRandomAmount() {
        CustomerAccountPage.enterRandomAmount();
    }

}
