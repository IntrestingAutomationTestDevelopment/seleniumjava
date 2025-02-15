package testksrabhilash;
import Pages.OlxLoginPage;
//import org.apache.commons.digester3.annotations.rules.FactoryCreate.List;
import org.testng.annotations.Test;

//import Pages.OlxLoginPage.*;
public class TestOlxLoginIndia  {
//WebDriver driver;
	
	@Test
	public static void loginOLX() {
		OlxLoginPage loginPage = new OlxLoginPage();
		loginPage.loginToOlx("sairaghavaabhilash40@gmail.com","301093Ksra$");
	}
}
