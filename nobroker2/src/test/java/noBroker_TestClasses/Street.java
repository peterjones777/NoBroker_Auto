package noBroker_TestClasses;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import noBroker_Library.Pause;

public class Street {
	WebDriver driver;
	
	By dropdown=By.xpath("//*[@class='autocomplete-dropdown-container']/div");
	By verify=By.xpath("//*[@id='autocomplete-dropdown-container']");
	By searchtype=By.id("listPageSearchLocality");
	
	public Street(WebDriver driver)
	{
	this.driver=driver;
	}
	public  String waitfor(int a) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(a));
		List<WebElement>locality=driver.findElements(dropdown);
		
		int b=locality.size();
		wait.until(ExpectedConditions.visibilityOfElementLocated(verify));
		Pause.stop(driver, 5);
		String m;
		if (b>=1){
			m="Dropdown Elements visible can proceed";
		    
		}
		else {
			m="Dropdown Elements not visible cant proceed";
		            
		      }
		return m;
	}
	
	
	


	
	
	public  void Search() 
	{
	driver.findElement(searchtype).sendKeys("Malad"," ");
	
	}
	
	
	

	public void chooseStreetSuggestion(int n) {
		 List<WebElement>locality=driver.findElements(dropdown);
		
		 //int b=locality.size();
	
	
	locality.get(n-1).click();
	
	
	

	}


}
