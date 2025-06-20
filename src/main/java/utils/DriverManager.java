package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("platformName", "Android");
            caps.setCapability("appPackage", "com.android.contacts");
            caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}