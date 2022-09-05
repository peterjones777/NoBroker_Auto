package noBroker_Library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Pause {
	public static void  stop(WebDriver driver,int a) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
}}
