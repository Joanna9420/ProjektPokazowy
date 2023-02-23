package selectors;

import org.openqa.selenium.By;

public class CustomerListPageSelectors {
    public static By CUSTOMER_LIST_SELECTOR = By.xpath("//select[@ng-model='custId']");
    public static By NEW_CUSTOMER_LOGIN_SELECTOR = By.xpath("//select[@name='userSelect']/option[last()]");
    public static By LOGIN_BUTTON = By.xpath("//button[contains(@ng-show,'custId !=')]");
    public static By byCustomerNameXpath(String customer_name){
        return By.xpath("//option[contains(text(),'" + customer_name +"')]");
    }


}
