package testksrabhilash;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Base;

public class LoginTest {
	//Set<String> myset = new HashSet<>();
	public static WebDriver driver;

	@Test
	public void qaEngineer() throws Exception {
		driver.get("https://www.chatgpt.com");
 }

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\seleniumjava\\src\\test\\resources\\vendor\\chrome-win32");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}
/**
 * static methods in Java cannot be overridden because static methods are associated with the class itself rather 
 * than an instance of the class
 */
}
