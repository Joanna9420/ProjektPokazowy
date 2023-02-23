package pageobjects;


import static helpers.CommonUtils.getText;
import static helpers.CommonUtils.isDisplayed;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static selectors.TransactionPageSelectors.*;
import static strings.StringsSample.FIRST_AMOUNT;

public class TransactionPage {
    public static void assertTransationVisibility(){
        isDisplayed(TRANSATION_SELECTOR);
        String CHECK_TRANSACION = getText(TRANSATION_SELECTOR);
        assertEquals(FIRST_AMOUNT, CHECK_TRANSACION);
        System.out.println("Transaction amount: " + CHECK_TRANSACION);
    }
}
