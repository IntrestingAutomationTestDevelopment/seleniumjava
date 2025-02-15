
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver;

	@BeforeSuite
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//abhilash//src//test//resources//vendor//chrome-win32");
		driver = new ChromeDriver();
	}

	@AfterSuite
	public static void tearDown() {
		driver.quit();
	}
}
