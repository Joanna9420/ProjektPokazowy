package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static synchronized WebDriver getDriver() {
        if (driver.get() == null || driver.get().toString().contains("(null)")){
            setWebDriver(chooseDriver());
        }
        return driver.get();
    }

    private static synchronized void  setWebDriver(WebDriver driver){DriverFactory.driver.set(driver);}

    private static synchronized WebDriver chooseDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        return new ChromeDriver(options);
    }

}