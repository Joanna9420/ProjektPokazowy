package pageobjects;


import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static selectors.CustomerAccountPageSelectors.TRANSACTION_CATEGORY;
import static selectors.TransactionPageSelectors.*;
import static strings.StringsSample.FIRST_AMOUNT;

public class TransactionPage {
    public static void assertTransationVisibility(){
        driver.navigate().refresh();
        click(TRANSACTION_CATEGORY);
        isDisplayed(TRANSACTION_SELECTOR);
        String CHECK_TRANSACION = getText(TRANSACTION_SELECTOR);
        assertEquals(FIRST_AMOUNT, CHECK_TRANSACION);
        System.out.println("Transaction amount: " + CHECK_TRANSACION);
    }
}
