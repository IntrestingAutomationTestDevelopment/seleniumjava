package testksrabhilash;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionTest2 {
	public static final String USERNAME = "sairaghavaabhilashkakarla";
	public static final String AUTOMATE_KEY = "Your_key";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");

		caps.setCapability("name", "SaiRaghavaAbhilashKakarla's First Test");
	}

	static Connection con = null;
	private static Statement stmt;
	public static String DB_URL = "jdbc:mysql://localhost/onlinebanking";
	public static String DB_USER = "Your_Database_Username";
	public static String DB_PASSWORD = "Your_Database_Password";

	@BeforeTest
	public void setUp() throws Exception {
		try {
			String dbClass = "com.mysql.cj.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() throws Exception {
		try {
			String query = "select * from user";
			ResultSet res = stmt.executeQuery(query);
			while (res.next()) {
				System.out.print(res.getString(1));
				System.out.print(" " + res.getString(2));
				System.out.print(" " + res.getString(3));
				System.out.println(" " + res.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
