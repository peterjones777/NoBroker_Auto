package noBroker_TestClasses;

import org.openqa.selenium.WebDriver;

public class CloseBrowser {
	WebDriver driver;
	public CloseBrowser(WebDriver driver) {
		this.driver=driver;
	}
	public void end() {
		driver.quit();
	}
}
