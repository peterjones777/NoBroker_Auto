package noBroker_TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import noBroker_Library.Pause;
import noBroker_TestClasses.BHK;
import noBroker_TestClasses.City;
import noBroker_TestClasses.CloseBrowser;
import noBroker_TestClasses.FourthProperty;
import noBroker_TestClasses.Initialize;
import noBroker_TestClasses.Search;
import noBroker_TestClasses.SelectingType;
import noBroker_TestClasses.Street;

@Test
public class MAIN {
	 	 WebDriver driver;
	 	 BHK bhkoption;
	 	 SelectingType buyoption;
	 	 City selCity;
	 	 Search search_button;
	 	FourthProperty prop;
	 	BHK assign;
	 	Street assignStreet;
	 	CloseBrowser close;
@BeforeTest
public void Initiate()  {
	
//****INITAITE WEBSITE
	driver=Initialize.Chromedriver();
	Initialize.maximize(driver);
	String URL="https://www.nobroker.in/";
	Initialize.navigate(driver, URL);
	Pause.stop(driver, 3);
}
//****SELECT BUY OR RENT
@Test(priority=1)
public void Buy() {
	buyoption=new SelectingType(driver);
	buyoption.Buy();
}
//****SELECT CITY BY CHANGING VALUE FOLLOWING INDEX IN DATAPROVIDER
@Test(priority=2,dataProvider="bhk",dataProviderClass =DataPro.class)
public void SelectCity(int n) 
{
	selCity=new City(driver);
	selCity.openmenu();
Assert.assertEquals(selCity.waitime( 20),"Elements visible can proceed");
selCity.ChooseCity(n); //assigning city
}
 

//***** SELECT STREET BY CHANGING VALUE FOLLOWING INDEX IN DATAPROVIDER

@Test(priority=3,dataProvider="bhk",dataProviderClass =DataPro.class)
public void AssignStreet(int n) {
	assignStreet=new Street(driver);

	assignStreet.Search();
Pause.stop(driver, 5);
 Assert.assertEquals(assignStreet.waitfor( 20),"Dropdown Elements visible can proceed");
	System.out.print(n);
	assignStreet.chooseStreetSuggestion(n); //chooses options in drop down menue
}
 //******SELECTING BHK BY CHANGING VALUE FOLLOWING INDEX IN DATAPROVIDER
@Test(priority=4)
public void SelectBHK() {
	bhkoption = new BHK(driver);
 bhkoption.search();
 Pause.stop(driver, 10);
}@Test(priority=5,dataProvider="bhk",dataProviderClass =DataPro.class)
 public void AssignBHK(int n) {
	 assign=new BHK(driver);
	 System.out.print(n);
assign.rooms(n);
}
 //****CLICKING SEARCH BUTTON
@Test(priority=6)
public void searchbutton() {
	search_button=new Search(driver);
	search_button.search();
}
 //****SELECTING FOURTH ELEMENT
@Test(priority=7)
 public void FourthElement() {
	 prop=new FourthProperty(driver);
 
	 prop.select( );
 Pause.stop(driver, 5);
 prop.switchtab();
 
 //*****VALIDATING DECRIPTION
 Pause.stop(driver, 7);
 prop.validate();
}
@AfterTest
public void ExitBrowser() {
	close=new CloseBrowser(driver);
	close.end();


}}