package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseStep {
    public static AndroidDriver driver;

    public static AndroidDriver Setup() throws Exception{
        DesiredCapabilities  dc = new DesiredCapabilities();

        dc.setCapability("deviceName", "Samsung SM-A528B");
        dc.setCapability("platformName", "Android");
        dc.setCapability(  "automationName", "UIAutomator2");
        dc.setCapability(  "App", "D:\\Java\\Cucumber\\Apps\\app.apk");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, dc);
        return driver;
    }
}
