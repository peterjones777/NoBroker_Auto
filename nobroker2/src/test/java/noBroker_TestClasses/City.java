package noBroker_TestClasses;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class City {
	WebDriver driver;
	
	By identify=By.xpath("//*[@id='react-select-2-option-10']");
	By open=By.xpath("//*[@id=\'searchCity\']");
	By citylist=By.xpath("//*[@class='css-q4imyt nb-select__menu-list']/div");
	
	public City(WebDriver driver) {
		this.driver=driver;
	}
	@Test
	public  String waitime(int a) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(a));
		WebElement pause=driver.findElement(identify);
		wait.until(ExpectedConditions.visibilityOfElementLocated(identify));
		String m;
		if (pause.isDisplayed()){
			m="Elements visible can proceed";
            
      }
		else {
			m="Elements not visible cant proceed";
		            
		      }
		return m;
      }
		
	
	
@Test
	public  void openmenu()  {
	
driver.findElement(open).click();
	
}
public void ChooseCity(int a) {
List<WebElement> cityli= driver.findElements(citylist);

	
		String m=cityli.get(a-1).getText();
		System.out.println(m);
	 cityli.get(a-1).click();
		 
		
	}
}

