package noBroker_TestCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class Nobrokerclass {
	 
	    
	 
@Test
public void openweb() throws InterruptedException {
	
//****INITAITE WEBSITE
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
driver.get("https://www.nobroker.in/");
Thread.sleep(3000);

//****SELECT BUY OR RENT
driver.findElement(By.cssSelector("div.nb__17yFj:nth-child(1)")).click();

//****SELECT CITY
driver.findElement(By.xpath("//*[@id=\'searchCity\']")).click();
Thread.sleep(1000);

List <WebElement> cityli= driver.findElements(By.xpath("//*[@class='css-q4imyt nb-select__menu-list']/div"));

int a=cityli.size();
 
 cityli.get(a-11).click();
 
//****CROSSCHECK CORRECT CITY OR NOT
 
/*String s=driver.findElement(By.xpath("//*[@id='searchCity']/div/div/div")).getText();
System.out.println(s);
Assert.assertEquals(s, "Mumbai");*/
 
//*****TYPE STREET NAME AND SELECT
 
 driver.findElement(By.id("listPageSearchLocality")).sendKeys("Malad"," ");
 Thread.sleep(5000);
 List<WebElement>locality=driver.findElements(By.xpath("//*[@class='autocomplete-dropdown-container']/div"));

 int b=locality.size();
 System.out.println(b);
 System.out.println("HELLOOOO");
Thread.sleep(2000);
 locality.get(b-3).click();
 Thread.sleep(3000);

 //******SELECTING BHK
 
 driver.findElement(By.xpath("//div[@class='nb-select__placeholder']")).click();
 Thread.sleep(5000);
 List<WebElement>bhk=driver.findElements(By.xpath("//*[@class='css-kj6f9i-menu nb-select__menu']/div/div"));
 int c=bhk.size();
 System.out.println(c);
 bhk.get(c-2).click();
 
 //****CLICKING SEARCH
 driver.findElement(By.xpath("//*[@class= 'prop-search-button btn btn-primary btn-lg']")).click();
 
 //****SELECTING FOURTH ELEMENT
 Thread.sleep(7000);
 
  WebElement element=driver.findElement(By.xpath("//div[@class='infinite-scroll-component ']/article[4]/div/div/section/div/span/h2"));
  JavascriptExecutor executor = (JavascriptExecutor)driver;
  executor.executeScript("arguments[0].click();", element);
  Thread.sleep(5000);
  //String w = driver.getWindowHandle();
  for(String wh : driver.getWindowHandles())
  {
      driver.switchTo().window(wh);
  }

  Thread.sleep(5000);
 String h=driver.getCurrentUrl();
 
 //*****VALIDATING DECRIPTION
  Thread.sleep(7000);
 
  //String UrlToClick=driver.findElement(By.xpath("//div[@class='infinite-scroll-component ']/article[4]/div/div/section/div/span/h2")).getAttribute("href");
  System.out.println(h);
  WebElement desc=driver.findElement(By.xpath("//div[@class='nb__1Ci-P']"));
 String cont;
 cont=desc.getText();
 System.out.println(cont);
double p=cont.length();

 if(p<=0) {
	 Assert.fail("oops.. no description");
 }
 else
	 System.out.println("descreption avaliable with "+ p + " characters");
 {

 
}
}
}


