package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BaseClass {

	
	public String udid = "ef1d4f6d8b48d4ecfe76cc634359ab131d60eeef";
	public String PlatformVersion = "12.0 ";
	public String DeviceName = "iPhone 7";
	 
	public WebDriver driver;

	@BeforeClass
	public void launchDriver() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", PlatformVersion);
		capabilities.setCapability("deviceName", DeviceName);
		capabilities.setCapability("app", System.getProperty("user.dir")+"/iOSFiles/UIKitCatalog.ipa");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("udid", udid);
		driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
