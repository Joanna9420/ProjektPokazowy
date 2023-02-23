package pageobjects;

import static helpers.CommonUtils.click;
import static helpers.CommonUtils.isDisplayed;
import static selectors.BankManagerPageSelectors.*;

public class BankManagerPage {
public static void assertBankManagerLogin(){
    if(isDisplayed(CATEGORY_BAR)){
        System.out.println("Logged in: Bank Manager");
    }
}
public static void addNewCustomer(){
    isDisplayed(ADD_CUSTOMER_CATEGORY);
    click(ADD_CUSTOMER_CATEGORY);
}
}
