package selectors;

import org.openqa.selenium.By;

public class OpenAccountPageSelectors {
    public static By FORM_ACCOUNT_SELECTOR = By.xpath("//label[contains(text(),'Customer')]");
    public static By LIST_OF_CUSTOMERS_SELECTOR = By.id("userSelect");
    public static By NEW_CUSTOMER_SELECTOR = By.xpath("//select[@name='userSelect']/option[last()]");
    public static By LIST_OF_CURRENCY_SELECTOR = By.id("currency");
    public static By DOLLAR_CURRENCY_SELECTOR = By.xpath("//option[@value='Dollar']");
    public static By PROCESS_BUTTON = By.xpath("//button[@type='submit'][text()='Process']");
    public static By HOME_BUTTON = By.xpath("//button[@ng-click='home()']");

}
