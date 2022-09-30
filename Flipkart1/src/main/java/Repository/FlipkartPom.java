package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WorkbookUtility;


public class FlipkartPom {
	
	public FlipkartPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closePage;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement clickOnSearch;
	
	//@FindBy(xpath="//input[@value='winter heater']")
	//private WebElement enterType;
	
	@FindBy(xpath="//div[@class=\"_1TmfNK\"][1]")
	private WebElement clickOnImg;
	
	@FindBy(xpath="//a[contains(@title,'DARSHANAM ')]")
	private WebElement actualproductName;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	
	@FindBy(xpath="//button[text()='GO TO CART']")
	private WebElement goToCart;
	
	
	//business library
	
  public void clickOnCloseBtn(){
	  closePage.click();
  }
 
  public void clickOnSearch(){
	  clickOnSearch.sendKeys("winter heater", Keys.ENTER);
	  
  }
  
  /* public void typeName(String value) {
	  enterType.sendKeys(value);
	  enterType.click();
	  
		  }
  */
  
  public void clickOnImgPic(){
	  clickOnImg.click();
  }
  
  public void clickOnProduct(){
	  actualproductName.click();
  }
  
  public void clickOnAddToCart(){
	  addToCart.click();
  }
  

  public void clickOnGoToCart(){
	  goToCart.click();
}
  
  public void productList(WebDriver driver, String ExpectedProductName) {

		driver.findElement(By.xpath("//a[text()='"+ExpectedProductName+"']")).click();
	}
  
  public void enterProductNameClick(WorkbookUtility workBookUtility ,String ExpectedProductName)
	{
	  actualproductName.sendKeys(ExpectedProductName);
	}
}

