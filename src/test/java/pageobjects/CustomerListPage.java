package pageobjects;

import org.openqa.selenium.By;

import static helpers.CommonUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static selectors.CustomerListPageSelectors.*;
import static strings.StringsSample.RANDOM_NAME;
import static strings.StringsSample.RANDOM_SURNAME;

public class CustomerListPage {
    public static void chooseCustomer(String customer_name){
        isDisplayed(CUSTOMER_LIST_SELECTOR);
        click(CUSTOMER_LIST_SELECTOR);
        click(byCustomerNameXpath(customer_name));
        assertSelectedCustomer(byCustomerNameXpath(customer_name));
        assertEquals(customer_name, getText(byCustomerNameXpath(customer_name)));
    }
    public static void chooseNewCustomer(){
        isDisplayed(CUSTOMER_LIST_SELECTOR);
        click(CUSTOMER_LIST_SELECTOR);
        click(NEW_CUSTOMER_LOGIN_SELECTOR);
        assertSelectedCustomer(NEW_CUSTOMER_LOGIN_SELECTOR);
        assertEquals(RANDOM_NAME+ " " +RANDOM_SURNAME,getText(NEW_CUSTOMER_LOGIN_SELECTOR));
    }


public static void loginCustomer(){
        isDisplayed(LOGIN_BUTTON);
        click(LOGIN_BUTTON);
}

}
