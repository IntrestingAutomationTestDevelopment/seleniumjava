/*
 * package Tests;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.IOException;
 * 
 * 
 * public class ReadTestDataFileInfo {
 * 
 * 
 * 
 * // Function to read Excel data public static Object[][] readExcelData(String
 * filePath) throws IOException, InvalidFormatException { // Create a
 * FileInputStream to read the Excel file FileInputStream fis = new
 * FileInputStream(new File(filePath));
 * 
 * // Create a Workbook instance (works for both .xls and .xlsx formats)
 * Workbook workbook = new XSSFWorkbook(fis);
 * 
 * // Get the sheet by name Sheet sheet = workbook.getSheetAt(0); // First sheet
 * 
 * // Get the number of rows and columns int rows =
 * sheet.getPhysicalNumberOfRows(); int cols =
 * sheet.getRow(0).getPhysicalNumberOfCells();
 * 
 * // Create a 2D array to store the data Object[][] data = new Object[rows -
 * 1][cols]; // Excluding header row
 * 
 * // Loop through rows and columns and store data in the 2D array for (int i =
 * 1; i < rows; i++) { Row row = sheet.getRow(i); for (int j = 0; j < cols; j++)
 * { data[i - 1][j] = row.getCell(j).toString(); // Store each cell value } }
 * 
 * // Close the workbook and FileInputStream workbook.close(); fis.close();
 * 
 * return data; }
 * 
 * public static void main(String[] args) throws IOException,
 * InvalidFormatException { // Path to your Excel file String filePath =
 * "path_to_your_excel_file/testData.xlsx";
 * 
 * // Read the test data from Excel Object[][] testData =
 * readExcelData(filePath);
 * 
 * // Initialize WebDriver WebDriver driver = new ChromeDriver();
 * driver.get("https://example.com/login");
 * 
 * // Loop through each set of test data for (Object[] data : testData) { //
 * Extract test data String username = (String) data[0]; String password =
 * (String) data[1]; String expectedResult = (String) data[2];
 * 
 * // Find the username and password fields and input data WebElement
 * usernameField = driver.findElement(By.id("username")); WebElement
 * passwordField = driver.findElement(By.id("password")); WebElement loginButton
 * = driver.findElement(By.id("loginButton"));
 * 
 * usernameField.clear(); passwordField.clear();
 * 
 * usernameField.sendKeys(username); passwordField.sendKeys(password);
 * loginButton.click();
 * 
 * // Verify if login is successful WebElement loginMessage =
 * driver.findElement(By.id("loginMessage")); if
 * (loginMessage.getText().equals(expectedResult)) {
 * System.out.println("Test passed for user: " + username); } else {
 * System.out.println("Test failed for user: " + username); } }
 * 
 * // Close the browser driver.quit(); } }
 * 
 */
package testksrabhilash;

