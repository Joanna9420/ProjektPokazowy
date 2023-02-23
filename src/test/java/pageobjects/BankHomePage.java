package pageobjects;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static selectors.BankHomePageSelectors.*;

public class BankHomePage {
    public static void openBankWebsite(){
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");
    }
public static void assertHomePageUrl(){
    String HOME_PAGE_URL = driver.getCurrentUrl();
    System.out.println("Opened link: " + HOME_PAGE_URL);
    click(HOME_PAGE_BUTTON);
    String CHECKED_HOME_URL = driver.getCurrentUrl();
    System.out.println("Current link: " + CHECKED_HOME_URL);
    if (HOME_PAGE_URL.equals(CHECKED_HOME_URL)){
        System.out.println("You are on Home Page.");
    }else {System.out.println("Correct homepage link: " + driver.getCurrentUrl());}

}
public static void chooseCustomerLoginCategory(){
        isDisplayed(CUSTOMER_LOGIN_SELECTOR);
        click(CUSTOMER_LOGIN_SELECTOR);
}
    public static void chooseManagerLoginCategory(){
        isDisplayed(MANAGER_LOGIN_SELECTOR);
        click(MANAGER_LOGIN_SELECTOR);
    }


}
