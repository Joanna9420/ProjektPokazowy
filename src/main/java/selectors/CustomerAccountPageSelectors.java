package selectors;

import org.openqa.selenium.By;

public class CustomerAccountPageSelectors {
    public static By CUSTOMER_LOGGED_ID = By.xpath("//span[@class='fontBig ng-binding']");
    public static By ACCOUNT_NUMBER = By.xpath("//strong[contains(@class,'ng-binding')][1]");
    public static By ACCOUNT_BALANCE = By.xpath("//strong[contains(@class,'ng-binding')][2]");
    public static By ACCOUNT_CURRENCY = By.xpath("//strong[contains(@class,'ng-binding')][3]");
    public static By TRANSACTION_CATEGORY = By.xpath("//button[contains(text(),'Transactions')]");
    public static By DEPOSIT_CATEGORY = By.xpath("//button[@ng-class='btnClass2']");
    public static By WITHDRAWL_CATEGORY = By.xpath("//button[@ng-class='btnClass3']");
    public static By AMOUNT_INPUT = By.xpath("//input[@type='number']");
    public static By DEPOSIT_BUTTON = By.xpath("//button[@type='submit'][text()='Deposit']");
    public static By WITHDRAW_BUTTON = By.xpath("//button[@type='submit'][@class='btn btn-default']");
    public static By TRANSACTION_STATUS = By.xpath("//div[@class='ng-scope']//span[@ng-show='message']");
    public static By DEPOSIT_STATUS = By.xpath("//div[@class='ng-scope']//span[@class='error ng-binding']");
    public static By ACCOUNT_SELECTOR = By.name("accountSelect");

    public static By byAccountNumberXpath(String account_number){
        return By.xpath("//select[@name='accountSelect']//option[@label='" + account_number + "']");
    }






}
