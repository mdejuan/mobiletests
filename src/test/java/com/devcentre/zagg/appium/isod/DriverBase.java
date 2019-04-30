package com.devcentre.zagg.appium.isod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverBase {
	public static AndroidDriver<MobileElement> driver;
    public static WebDriverWait wait;
    @BeforeSuite(alwaysRun = true)
	public static void instantiateDriverObject() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "BG2-W09");
		caps.setCapability("deviceId", "89.100.208.189:5555"); // DeviceId from "adb devices" command
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.zagg.isod");
		caps.setCapability("appActivity", "com.zagg.isod.SplashScreenActivity");
		caps.setCapability("noReset", "false");
		caps.setCapability("unicodeKeyboard", "true");                                     
		caps.setCapability("resetKeyboard", "true");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
	}
    
    @AfterSuite(alwaysRun = true)
    public static void closeDriverObject() {
    	driver.quit();
    }
}
