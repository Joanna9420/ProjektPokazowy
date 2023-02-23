package pageobjects;

import org.openqa.selenium.Alert;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static selectors.OpenAccountPageSelectors.*;

public class OpenAccountPage {
    public static void assertOpenAccountPage() {
        if (isDisplayed(FORM_ACCOUNT_SELECTOR)) {
            System.out.println("You can open new Account");
        }
    }
    public static void chooseNewCustomer(){
        isDisplayed(LIST_OF_CUSTOMERS_SELECTOR);
        click(LIST_OF_CUSTOMERS_SELECTOR);
        click(NEW_CUSTOMER_SELECTOR);
        assertSelectedCustomer(NEW_CUSTOMER_SELECTOR);
    }
    public static void pickDollarCurrency(){
        isDisplayed(LIST_OF_CURRENCY_SELECTOR);
        click(LIST_OF_CURRENCY_SELECTOR);
        click(DOLLAR_CURRENCY_SELECTOR);
        String SELECTED_CURRENCY = getText(DOLLAR_CURRENCY_SELECTOR);
        assertEquals("Dollar", SELECTED_CURRENCY);
        System.out.println("Selected currency: " + SELECTED_CURRENCY);
    }
    public static void openNewAccount(){
        isClickabled(PROCESS_BUTTON);
        click(PROCESS_BUTTON);
    }
    public static void confirmOpenedNewAccount(){
        Alert openNewAccountAlert = driver.switchTo().alert();
        System.out.println(openNewAccountAlert.getText());
        openNewAccountAlert.accept();
    }
    public static void backToHomePage(){
        isDisplayed(HOME_BUTTON);
        click(HOME_BUTTON);
    }

}
