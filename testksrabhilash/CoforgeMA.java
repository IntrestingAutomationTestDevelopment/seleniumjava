package testksrabhilash;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoforgeMA {

	/**
	 * After coforge prep for nttdata
	 */

	public static WebDriver driver;

	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept(); // Accept the alert
	}

	public static void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss(); // Dismiss the alert

	}

	public static void setTextAlert() {
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Input"); // Send text to the alert
	}

	public static void getTextAlert() {
		Alert alert = driver.switchTo().alert();
		alert.getText(); // Get the alert text
	}

	/**
	 * Synchronization
	 */
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// WebElement element
	public static void explicitWait(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void fluentWait() {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

	}

	public static void selectOptionsByVisibleText(By by) {
		Select dropdown = new Select(driver.findElement(by));
		dropdown.selectByVisibleText("Option Text");

	}

	public static void selectOptionsByIndex(int i, By by) {
		Select dropdown = new Select(driver.findElement(by));
		dropdown.selectByIndex(i);
	}

	public static void selectOptionsByValue(By by) {
		Select dropdown = new Select(driver.findElement(by));
		dropdown.selectByValue("optionValue");
	}

	public static void mouseHover(By by) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(by);
		actions.moveToElement(element).perform();

	}

	public static void windowsHandling() throws Exception {
		String mainWindow = null;
		try {

			mainWindow = driver.getWindowHandle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
			}
		}
		driver.switchTo().window(mainWindow); // Switch back to the main window

	}

//	driver.findElement(By.xpath("//tagname[contains(@attribute, 'partialValue')]"));
	public static void jslocateElement(By by) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(by));

	}// element 107 line

	public static void jsclick(By by) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", by);

	}

	public static void takeScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(source, new File("path/to/screenshot.png"));

	}
}
