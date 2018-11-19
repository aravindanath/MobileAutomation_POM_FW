package pageRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	protected WebDriver driver;
	
	
	public BasePage(WebDriver driver)
	{		
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver, Duration.ofSeconds(30)),this); 
	}
	
	
	
}
