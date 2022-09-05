package noBroker_TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	WebDriver driver;
	By search1=By.xpath("//*[@class= 'prop-search-button btn btn-primary btn-lg']");
	public Search(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void search() {
	driver.findElement(search1).click();

}
	}
