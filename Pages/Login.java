package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	/*
	 * public static void main (String args) {
	 * 
	 * }
	 */
	// @FindBy(xpath = "")
	@Test(priority = 0)
	public static void testLoginChatGPTAI(WebDriver driver) {

		driver.get("https:://www.chatgpt.com");

	}

	@Test(priority =1)
	public static void qaE() {
		
	}
}