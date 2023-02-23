package pageobjects;


import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static selectors.CustomerAccountPageSelectors.*;
import static strings.StringsSample.*;

public class CustomerAccountPage {
    public static void assertCustomerLoggedIn() {
        isDisplayed(CUSTOMER_LOGGED_ID);
        String CUSTOMER_LOGGED = getText(CUSTOMER_LOGGED_ID);
        System.out.println("User logged in: " + CUSTOMER_LOGGED);
        if (CUSTOMER_LOGGED.equals("Hermoine Granger")) {
            System.out.println("Hermoine successfully logged in.");
        } else if (CUSTOMER_LOGGED.equals("Harry Potter")) {
            System.out.println("Harry successfully logged in.");

        } else if (CUSTOMER_LOGGED.equals("Ron Weasly")) {
            System.out.println("Ron successfully logged in.");

        } else if (CUSTOMER_LOGGED.equals(RANDOM_NAME+ " " +RANDOM_SURNAME)) {
            System.out.println(RANDOM_NAME+ " " +RANDOM_SURNAME + " successfully logged in.");

        }

    }
    public static void chooseAccount(String account_number){
        isDisplayed(ACCOUNT_SELECTOR);
        click(ACCOUNT_SELECTOR);
        click(byAccountNumberXpath(account_number));
        String CHECK_ACCOUNT_NUMBER = getText(ACCOUNT_NUMBER);
        assertEquals(account_number, CHECK_ACCOUNT_NUMBER);
        System.out.println("Selected Account: " + CHECK_ACCOUNT_NUMBER);
        
    }
    
    public static void confirmCurrency(String currency_name){
        isDisplayed(ACCOUNT_CURRENCY);
        String CURRENT_CURRENCY = getText(ACCOUNT_CURRENCY);
        if (CURRENT_CURRENCY.equals(currency_name)) {
            System.out.println("Current currency: " + CURRENT_CURRENCY);
        } else {
            System.out.println("Error");
        }
        
    }

    public static void checkCurrentCurrency() {
        isDisplayed(ACCOUNT_CURRENCY);
        String CURRENT_CURRENCY = getText(ACCOUNT_CURRENCY);
        if (CURRENT_CURRENCY.equals("Dollar")) {
            System.out.println("Current currency: " + CURRENT_CURRENCY);
        } else if (CURRENT_CURRENCY.equals("Pound")) {
            System.out.println("Current currency: " + CURRENT_CURRENCY);

        } else if (CURRENT_CURRENCY.equals("Rupee")) {
            System.out.println("Current currency: " + CURRENT_CURRENCY);
        }

    }


    public static void checkAccountBalance() {
        isDisplayed(ACCOUNT_BALANCE);
        String CURRENT_BALANCE = driver.findElement(ACCOUNT_BALANCE).getText();
        System.out.println("Account Balance: " + CURRENT_BALANCE);
    }

    public static void clickWithdrawlCategory() {
        if (getText(ACCOUNT_BALANCE).matches("0")) {
            System.out.println("You don't have enough funds in your account.");
        } else {
            isDisplayed(WITHDRAWL_CATEGORY);
            click(WITHDRAWL_CATEGORY);
        }

    }

    public static void chooseWithdrawlCategory() {
        isDisplayed(WITHDRAWL_CATEGORY);
        click(WITHDRAWL_CATEGORY);
    }

    public static void chooseDepositCategory() {
        isDisplayed(DEPOSIT_CATEGORY);
        click(DEPOSIT_CATEGORY);
    }

    public static void chooseTransactionCategory() {
        isDisplayed(TRANSACTION_CATEGORY);
        click(TRANSACTION_CATEGORY);
    }


    public static void enterAccountBalanceAmount() {
        String AMOUNT_BALANCE = getText(ACCOUNT_BALANCE);
        type(AMOUNT_INPUT, AMOUNT_BALANCE);

    }


    public static void enterRandomAmount() {
        isDisplayed(AMOUNT_INPUT);
        type(AMOUNT_INPUT, FIRST_AMOUNT);
    }

    public static void clickButtonDeposit() {
        isClickabled(DEPOSIT_BUTTON);
        click(DEPOSIT_BUTTON);
    }

    public static void clickButtonWithdraw() {
        isClickabled(WITHDRAW_BUTTON);
        click(WITHDRAW_BUTTON);
    }


    public static void checkTransactionStatus() {
        isDisplayed(TRANSACTION_STATUS);
        String CHECK_TRANSACTION_STATUS = getText(TRANSACTION_STATUS);
        if (CHECK_TRANSACTION_STATUS.equals("Transaction successful")) {
            System.out.println(CHECK_TRANSACTION_STATUS);
        } else if (CHECK_TRANSACTION_STATUS.contains("Transaction Failed")) {
            System.out.println(CHECK_TRANSACTION_STATUS);

        }

    }

    public static void checkDepositStatus() {
        isDisplayed(DEPOSIT_STATUS);
        String CHECK_DEPOSIT_STATUS = getText(DEPOSIT_STATUS);
        if (CHECK_DEPOSIT_STATUS.equals("Deposit Successful")) {
            System.out.println(CHECK_DEPOSIT_STATUS);
        } else {
            System.out.println("Error");

        }
    }


}
