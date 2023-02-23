package selectors;

import org.openqa.selenium.By;

public class AddCustomerPageSelectors {
    public static By FORM_CUSTOMER_SELECTOR = By.xpath("//div[@class='ng-scope']//form");
    public static By FIRST_NAME_INPUT_SELECTOR = By.xpath("//input[@placeholder='First Name']");
    public static By LAST_NAME_INPUT_SELECTOR = By.xpath("//input[@placeholder='Last Name']");
    public static By POST_CODE_INPUT_SELECTOR = By.xpath("//input[@placeholder='Post Code']");
    public static By ADD_CUSTOMER_BUTTON = By.xpath("//button[@type='submit'][text()='Add Customer']");
    public static By OPEN_ACCOUNT_CATEGORY = By.xpath("//button[@ng-click='openAccount()']");
}
