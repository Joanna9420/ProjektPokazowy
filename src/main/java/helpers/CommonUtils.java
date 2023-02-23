package helpers;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.time.Duration;
import static drivers.DriverFactory.driver;

public class CommonUtils {
    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public static void click(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public static void type(By locator, String text) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }
    public static boolean isDisplayed(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    public static boolean isClickabled(By locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator)).isDisplayed();
    }
    public static String getRandomName(int number) {
        return RandomStringUtils.randomAlphabetic(number).toLowerCase();
    }

    public static String getRandomNumberBetween(int min, int max) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(min + Math.floor(max - min) * Math.random());
    }
    public static String getRandomPostCode(int numberAmount) {
        return RandomStringUtils.randomNumeric(numberAmount);
    }
    public static void assertSelectedCustomer(By locator){
        String CUSTOMER_NAME = driver.findElement(locator).getText();
        System.out.println("User selected: " + CUSTOMER_NAME);
    }
    public static String getText(By locator){
        return driver.findElement(locator).getText();

    }

}
