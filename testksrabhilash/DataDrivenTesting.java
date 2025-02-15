package testksrabhilash;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class DataDrivenTesting {

	/*
	 * public static void main(String[] args) throws IOException { // Path to your
	 * Excel file String filePath = "TestData.xlsx"; // Load the data from Excel
	 * FileInputStream fis = new FileInputStream(new File(filePath)); Workbook
	 * workbook = new XSSFWorkbook(fis); Sheet sheet = workbook.getSheet("Sheet1");
	 * // Replace with your sheet name
	 * 
	 * // Set up WebDriver (use ChromeDriver here as an example)
	 * System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * // Iterate through rows and perform tests for (int i = 1; i <=
	 * sheet.getLastRowNum(); i++) { // Start from row 1 to skip headers Row row =
	 * sheet.getRow(i);
	 * 
	 * // Read data from columns String username =
	 * row.getCell(0).getStringCellValue(); String password =
	 * row.getCell(1).getStringCellValue();
	 * 
	 * // Perform your Selenium actions driver.get("https://example.com/login"); //
	 * Replace with your test URL
	 * 
	 * WebElement usernameField = driver.findElement(By.id("username")); // Replace
	 * with actual locators WebElement passwordField =
	 * driver.findElement(By.id("password")); WebElement loginButton =
	 * driver.findElement(By.id("loginButton"));
	 * 
	 * usernameField.sendKeys(username); passwordField.sendKeys(password);
	 * loginButton.click();
	 * 
	 * // Add validation and result logging
	 * System.out.println("Test executed for username: " + username); }
	 * 
	 * // Close resources workbook.close(); fis.close(); driver.quit(); }
	 */
}
