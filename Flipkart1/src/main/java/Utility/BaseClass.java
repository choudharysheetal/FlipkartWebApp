package Utility;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	
	public class BaseClass extends InstanceClass {
	


		@BeforeSuite
		//initialization 
		public void suiteSetup() {

			propertyUtility=new PropertyUtility();
			workBookUtility=new WorkbookUtility();
			seleniumUtility=new SeleniumUtility();
			javaUtility=new JavaUtility();

			propertyUtility.intialiePropertyFile(IPathContants.VITIGERPROPERTYFILEPATH);

			//Generate the Random Number
			randomNumber = javaUtility.getRandomNumber();

			// Get the control for particular sheet in Excel File
			workBookUtility.intializeExcelFile(IPathContants.VITIGEREXCELFILEPATH);

			// fetch the data from Property file
			url= propertyUtility.getDataFromProperty("url");
			
			browser = propertyUtility.getDataFromProperty("browser");
			timeouts = propertyUtility.getDataFromProperty("timeout");

		}
		@BeforeTest
		
		public void setupBrowser() {

			 driver = seleniumUtility.setupDriver(browser);

			//pre-setting the browser
			 seleniumUtility.maximizeBrowser();
			//convert String to Long
			longTimeout = javaUtility.convertStringToLong(timeouts);

			seleniumUtility.implicitWait(longTimeout);

			//initialize the Actions class
			seleniumUtility.initializeAction();

		}
		@BeforeMethod
		
		//login
		public void loginTest() {

			seleniumUtility.openApplication(url);
		

		}
		
		@AfterMethod
		
		
		public void LogoutTest() {
	
			seleniumUtility.closeBrowser();
		}
		@AfterTest
		
		public void closeBrowser()
		{
			seleniumUtility.closeBrowser();
		}
	}

