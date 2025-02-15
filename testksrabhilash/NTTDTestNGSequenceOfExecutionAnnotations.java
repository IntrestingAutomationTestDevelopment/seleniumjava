package testksrabhilash;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NTTDTestNGSequenceOfExecutionAnnotations {
	/*
	 * @BeforeSuite public static void setup() {
	 * 
	 * 
	 * }
	 */
	
	/*
	 * @BeforeClass public static void getDataFromThirdPartySite() {
	 * 
	 * }
	 */
	@BeforeMethod
	public static void raiseTheStandardofWork() {
		System.out.println("Sunfra Technologies 2015-2016");
		System.out.println("Reyan Infotechnologies 2016-2017");
		System.out.println("Jai Hanumana Gnana Guna Sagara 2017-2019");
		System.out.print("Capgemini Technology Services Pvt Ltd 2017-2019");
	}
	@Test
	public static void theHarderTheBattleTheSweeterTheVictory()  throws Exception{
		System.out.println("Capgemini Technology Service India Pvt Ltd 2022-2024");
		System.out.print("Job Market KSRA 30Jul1993");
	}
	@AfterMethod
	public static void maintainedTheStandardOfWork() throws Exception{
		System.out.println("Genpact Bengaluru 2019-2021");
		System.out.println("HCL 2021 2022");	
		System.out.println("Capgemini Technology Services 2022-2024");
		System.out.println("Tata Consultancy Services BLR March30 2023");	
		System.out.println("Tata Consultancy Services HYD September 01 2023");	
		System.out.println("Genpact Jan 2024");
		System.out.println("NTT Data Feb 2024");
		System.out.println("Tomorrow HCL Tech");	
		
	}
	/*
	 * @AfterClass public static void setDataInToOurMainApplication() throws
	 * Exception{
	 * 
	 * }
	 */
	/*
	 * @AfterSuite public static void tearDown() throws Exception{
	 * 
	 * 
	 * }
	 */
}
