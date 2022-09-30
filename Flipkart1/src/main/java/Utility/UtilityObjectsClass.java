package Utility;



	import org.openqa.selenium.WebDriver;

	public class UtilityObjectsClass {
		
		
		private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
		private static ThreadLocal<SeleniumUtility> seleniumUtilityThread=new ThreadLocal<>();
		private static ThreadLocal<JavaUtility> javaUtilityThread=new ThreadLocal<>();
		private static ThreadLocal<WorkbookUtility> workbookUtilityThread=new ThreadLocal<>();
		private static ThreadLocal<PropertyUtility> propertyUtilityThread=new ThreadLocal<>();
		//ThreadLocal<PropertyFileUtility> fileUtility=new ThreadLocal<>();
		
		
		public static WebDriver getDriver() {
			return driver.get();
		}
		
		public static void setDriver(WebDriver actdriver) {
			driver.set(actdriver);
		}
		
		public static SeleniumUtility getSeleniumUtility() {
			return seleniumUtilityThread.get();
		}
		
		public static  void setSeleniumUtility(SeleniumUtility actseleniumUtility) {
			seleniumUtilityThread.set(actseleniumUtility);
		}
		
		public JavaUtility getJavaUtility() {
			return javaUtilityThread.get();
		}
		
		
		public static void setJavaUtility(JavaUtility actjavaUtility) {
			javaUtilityThread.set(actjavaUtility);;
		}
		
		
		public WorkbookUtility getWorbookUtility() {
			return workbookUtilityThread.get();
		}
		
		
		public  static void setWorkbookUtility(WorkbookUtility actworkbookUtility) {
			workbookUtilityThread.set(actworkbookUtility);;
		}
		
		
		public PropertyUtility getPropertyUtility() {
			return propertyUtilityThread.get();
		}
		
		
		public void setFileUtility(PropertyUtility actpropertyUtility) {
			propertyUtilityThread.set(actpropertyUtility);;
		}

	}
