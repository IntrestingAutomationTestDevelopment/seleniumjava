package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Action {
	
	public static WebDriver driver;
	//public static void scrollTo() {
		
/**|
 * Scroll To Element Java Script Executor
 */
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

         // Use JavaScript to scroll to the element
 
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

         // Additional operations can be performed after scrolling if necessary
         // For example, perform a click action on the element
        element.click();
	}
	public static void contextClick() {
		 
	}
}
