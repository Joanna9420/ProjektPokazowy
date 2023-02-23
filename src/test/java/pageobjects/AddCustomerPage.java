package pageobjects;

import org.openqa.selenium.Alert;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static selectors.AddCustomerPageSelectors.*;
import static strings.StringsSample.*;

public class AddCustomerPage {
    public static void assertAddCustomerPage() {
        if (isDisplayed(FORM_CUSTOMER_SELECTOR)) {
            System.out.println("You can add new Customer");
        }
    }


    public static void enterRandomName() {
        isDisplayed(FIRST_NAME_INPUT_SELECTOR);
        type(FIRST_NAME_INPUT_SELECTOR, RANDOM_NAME);
    }

    public static void enterRandomSurname() {
        isDisplayed(LAST_NAME_INPUT_SELECTOR);
        type(LAST_NAME_INPUT_SELECTOR, RANDOM_SURNAME);
    }

    public static void enterRandomPostCode() {
        isDisplayed(POST_CODE_INPUT_SELECTOR);
        type(POST_CODE_INPUT_SELECTOR, RANDOM_POST_CODE);
    }

    public static void createNewCustomer() {
        isClickabled(ADD_CUSTOMER_BUTTON);
        click(ADD_CUSTOMER_BUTTON);
    }

    public static void confirmNewCustomer() {
        Alert newCustomerAlert = driver.switchTo().alert();
        System.out.println(newCustomerAlert.getText());
        newCustomerAlert.accept();
    }

    public static void openNewAccount() {
        isDisplayed(OPEN_ACCOUNT_CATEGORY);
        click(OPEN_ACCOUNT_CATEGORY);
    }


}
