package noBroker_TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectingType {
	WebDriver driver;
	
	By buy=By.cssSelector("div.nb__17yFj:nth-child(1)");
	
	public SelectingType(WebDriver driver) {
		this.driver=driver;
	}
	public  void Buy() {
		
		driver.findElement(buy).click();
	
	}
	

}
