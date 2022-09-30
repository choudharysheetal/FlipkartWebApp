package Utility;

import org.openqa.selenium.WebDriver;

import Repository.FlipkartPom;


public class InstanceClass {
	
	public PropertyUtility propertyUtility;
	public	WorkbookUtility workBookUtility;
	public	SeleniumUtility seleniumUtility;
	public JavaUtility javaUtility;
	public int randomNumber ;
	protected	String url;
	protected	String userName ;
	protected	String passWord;
	protected	String browser;
	protected	String timeouts ;
	protected	long longTimeout;
	public WebDriver driver;
	public FlipkartPom flip;


}
