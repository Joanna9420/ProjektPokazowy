package selectors;


import org.openqa.selenium.By;

public class BankHomePageSelectors {
    public static By HOME_PAGE_BUTTON = By.xpath("//button[@class='btn home']");
    public static By CUSTOMER_LOGIN_SELECTOR = By.xpath("//button[@ng-click='customer()']");
    public static By MANAGER_LOGIN_SELECTOR = By.xpath("//button[@ng-click='manager()']");
}
