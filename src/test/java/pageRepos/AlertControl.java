package pageRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AlertControl extends BasePage {
	public AlertControl(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "Alert Controller")
	private WebElement alertContoller;

	@iOSXCUITFindBy(accessibility = "Simple")
	private WebElement simpleAlert;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement okBtn;

	public void simpleAert() {

		alertContoller.click();
		simpleAlert.click();
		okBtn.click();

	}

}
