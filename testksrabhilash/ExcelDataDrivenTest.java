/*
 * package Tests;
 * 
 * import org.apache.poi.ss.usermodel.*; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook; import org.openqa.selenium.By;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.IOException;
 * 
 * public class ExcelDataDrivenTest {
 * 
 * // Method to read data from Excel file and return it in a 2D Object array
 * public static Object[][] readExcelData(String filePath) throws IOException {
 * // Create FileInputStream to read the Excel file FileInputStream fis = new
 * FileInputStream(new File(filePath));
 * 
 * // Create Workbook instance (works for both .xls and .xlsx files) Workbook
 * workbook = new XSSFWorkbook(fis);
 * 
 * // Get the first sheet (assuming data is on the first sheet) Sheet sheet =
 * workbook.getSheetAt(0);
 * 
 * // Get the number of rows and columns in the sheet int rows =
 * sheet.getPhysicalNumberOfRows(); int cols =
 * sheet.getRow(0).getPhysicalNumberOfCells();
 * 
 * // Create a 2D array to store data from the Excel file Object[][] data = new
 * Object[rows - 1][cols]; // Excluding the header row
 * 
 * // Loop through the rows and columns to get data for (int i = 1; i < rows;
 * i++) { // Skip header row Row row = sheet.getRow(i); for (int j = 0; j <
 * cols; j++) { data[i - 1][j] = row.getCell(j).toString(); // Convert cell
 * value to string } }
 * 
 * // Close the workbook and input stream workbook.close(); fis.close();
 * 
 * return data; }
 * 
 * public static void main(String[] args) throws IOException { // Path to your
 * Excel file String filePath = "path_to_your_excel_file/testData.xlsx";
 * 
 * // Read test data from Excel file Object[][] testData =
 * readExcelData(filePath);
 * 
 * // Initialize WebDriver (ChromeDriver) WebDriver driver = new ChromeDriver();
 * driver.get("https://example.com/login"); // URL of your login page
 * 
 * // Loop through each row of data (test case) for (Object[] data : testData) {
 * // Extract data for each test String username = (String) data[0]; // First
 * column: username String password = (String) data[1]; // Second column:
 * password String expectedResult = (String) data[2]; // Third column: expected
 * result
 * 
 * // Locate and interact with the login elements WebElement usernameField =
 * driver.findElement(By.id("username")); WebElement passwordField =
 * driver.findElement(By.id("password")); WebElement loginButton =
 * driver.findElement(By.id("loginButton"));
 * 
 * // Clear any previous data and input the current test data
 * usernameField.clear(); passwordField.clear();
 * usernameField.sendKeys(username); passwordField.sendKeys(password);
 * loginButton.click();
 * 
 * // Example of verifying the login result WebElement loginMessage =
 * driver.findElement(By.id("loginMessage")); if
 * (loginMessage.getText().equals(expectedResult)) {
 * System.out.println("Test passed for user: " + username); } else {
 * System.out.println("Test failed for user: " + username); } }
 * 
 * // Close the browser driver.quit(); } }
 * 
 * }
 */
package testksrabhilash;

