package noBroker_TestClasses;

import java.util.List;

import noBroker_Library.Pause;
import noBroker_TestCases.MAIN;
import noBroker_TestClasses.Initialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class BHK {
 WebDriver driver;
	 
	 By selectbhk=By.xpath("//div[@class='nb-select__placeholder']");
	By selectbhklist=By.xpath("//*[@class='css-kj6f9i-menu nb-select__menu']/div/div");
	
	public BHK(WebDriver driver)
	{
	this.driver=driver;
	}
	
	
	
	public  void search()
{
		
	 driver.findElement(selectbhk).click();

}
public  void rooms( int n) {

	List<WebElement>room=driver.findElements(selectbhklist);
	//int c=room.size();
	 //WebElement  select_bhk;
	Pause.stop(driver, 7);
	 room.get(n-1).click();
	 Pause.stop(driver, 7);
	 System.out.println("done");
	/* if(n==1) {
		 select_bhk=room.get(0);
	 }
	 else if(n==2) {
		 select_bhk=room.get(1);
	 }
	 else if(n==3) {
		 select_bhk=room.get(2);
	 }
	 else if(n==4) {
		 select_bhk=room.get(c-2);
	 }
	 else {
		 select_bhk=room.get(4);
	 }*/

	 
}
}
