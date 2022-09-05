package noBroker_TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import noBroker_Library.Pause;
public class FourthProperty {
	WebDriver driver;
	
	By article_path=By.xpath("//div[@class='infinite-scroll-component ']/article[4]/div/div/section/div/span/h2");
	By desctext=By.xpath("//div[@class='nb__1Ci-P']");
	
	public FourthProperty(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public  void select() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(article_path));
	WebElement element=driver.findElement(article_path);
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",element);
	}
	
	public void switchtab()  {
		 for(String wh : driver.getWindowHandles())
		  {
		      driver.switchTo().window(wh);
		  }

		
	}
	public  void validate()  {
		Pause.stop(driver, 7);
	 WebElement desc=driver.findElement(desctext);
	 String cont;
	 cont=desc.getText();
	 System.out.println(cont);
	double p=cont.length();

	 if(p<=0) {
		 Assert.fail("oops.. no description");
	 }
	 else
		 System.out.println("SUCCESS!!! description avaliable with "+ p + " characters");
	 {
}
	 }
}