package noBroker_TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialize {
	public static WebDriver Chromedriver() {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
return driver;
	}
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void navigate(WebDriver driver, String a) {
	driver.get(a);

	}	
	}
