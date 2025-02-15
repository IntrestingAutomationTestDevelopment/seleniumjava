package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OlxLoginPage {

	public void OlxLoginPage(WebDriver driver) {
		driver = this.driver;
	}

	public static WebDriver driver;
	public static By loginBtn = By.xpath("//span[contains(text(),'Login')]");
	public static By loginWithEmail = By.xpath("//span//span[contains(.,'Login with Email')]");
	public static By userName = By.xpath("//*[@id='email_input_field']");
	public static By next = By.xpath("//button[@type='submit' and @data-aut-id='submitBtn']");
	public static By passWord = By.xpath("//*[@id='password']");
	public static By login = By.xpath("//div//button[@type='submit']//span[contains(.,'Log in')]");

	@BeforeMethod
	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"(user.dir)"+"\\src\\test\\resources\\vendor\\chrome-win32\\chrome.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

	public void loginToOlx(String loginId, String loginPwd) {
		driver.get("https://www.olx.in");
		driver.findElement(loginWithEmail).click();
		driver.findElement(userName).sendKeys(loginId);
		driver.findElement(next).click();
		driver.findElement(passWord).sendKeys(loginPwd);

	}

}
