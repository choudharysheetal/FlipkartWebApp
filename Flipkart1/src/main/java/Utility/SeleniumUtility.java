package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	
	private WebDriver driver;
	private Actions act;
	
	/**
	 * This method is used  to setup the driver instance
	 * @param browser
	 * @return
	 */
	
	public WebDriver setupDriver(String browser)
	{
		switch (browser)
		{
		
		case "chrome":
			WebDriverManager.chromedriver().setup(); //method chaining
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup(); //method chaining
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			WebDriverManager.iedriver().setup();  //method chaining
			driver=new InternetExplorerDriver();
			break;
			
			default:
				System.out.println("You entered wrong Browser key in the Property file");
				break;
		}
		return driver;
	}
	/**
	 * This method is used to maximize the browser
	 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
		/**
		 * This method is used to wait the page by using implicit wait
		 * @param longTimeout
		 */
	public void implicitWait(long longTimeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}
	
	/**
	 * This method is used to navigate the application
	 * @param url
	 */
	public void openApplication(String url)
	{
		driver.get(url);
	}
	/**
	 * this method is used to initialize the Action class
	 */
	public void initializeAction()
	{
		act=new Actions(driver);
	}
	/**
	 * This method is used to Mouse hover on element
	 * @param element
	 */
	
	public void mouseHoverOnElement(WebElement element)
	{
		act.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform right click action on current mouse location
	 */
	
	public void rightClickAction()
	{
		act.contextClick().perform();
	}
	
	/**
	 * This method is used to perform right click on particular webelement
	 * @param element
	 */
	public void rightClickAction(WebElement element)
	{
		act.contextClick(element).perform();
	}
	/**
	 * this method is used to close particular Browser
	 */
	public void closeBrowser()
	{
		driver.quit();
	}
	/**
	 * this method is used to close particular Tab
	 */
	public void closeTab()
	{
		driver.close();
	}
	
	/**
	 * 
	 * This method is used switch frame based on index
	 * @param index
	 */
	public void switchFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch Frame based on Web element
	 * @param nameOrID
	 */
	public void switchFrame( String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}
	/**
	 * 
	 * @param strategy
	 */
	public void switchBackFromFrame(String strategy) {
		switch(strategy.toLowerCase().trim()) {
		case "default":
			
			driver.switchTo().defaultContent();
			break;
		case "parent":
			
			driver.switchTo().parentFrame();
			break;
			default:
				
				System.out.println("please Enter valid strategy either <default or parent>");
				
			
		}
		//public void customWait() {
		//public void initializeExplicitWait()
		//public void waitTillElementVisible
		//public void waitTillElementInVisible()
		//public void FluentWait()
		//jsPopupgetText()
		//jsPopupgetData()
		//jsPopupsendData()
		//switchWindowBasedOnCurrentUrl()
		//HighlightElement
		
			
		}
	
	/**
	 * This method is used to handle <select> tag Dropdown by using Attribute Value od<options>Tag
	 * @param value
	 * @param dropDownElement
	 */
	
	public void handleSelectDropDown(String value,WebElement dropDownElement) {
		Select select=new Select(dropDownElement);
		
		select.selectByValue(value);
	}
	/**
	 * This method is used to handle <select> tag Dropdown by using IndexNumber
	 * @param dropDownElement
	 * @param indexNumber
	 */
	public void handleSelectDropDown(WebElement dropDownElement,int indexNumber) {
		Select select=new Select(dropDownElement);
		
		select.deselectByIndex(indexNumber);
		
	}
	public WebDriver setUpDriver(String browser) {
		return null;
	}
	
	public void getWindowHandles()
	{
	Set<String> tab = driver.getWindowHandles();
	for(String tabs:tab)
		driver.switchTo().window(tabs);
		
	}
	
	public void getWindowDefault() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to taking a Screenshot.
	 * @return 
	 */
	public String takeScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/Result.png");
		
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		return dest.getAbsolutePath();
	}
	
	public String takeScreenshot1() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		 String src = ts.getScreenshotAs(OutputType.BASE64);
		return src;
}
	public byte[] takeScreenshot2() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		 byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		return src;
}
	public void switchWindow() {
		Set<String> windowId = driver.getWindowHandles();
		for(String id:windowId) {
			driver.switchTo().window(id);
		}
	}
			
}
	

	





