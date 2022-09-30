package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class ProductPage {
	
	
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
		private WebElement 	addToCartButton;
		
		@FindBy(xpath="//div[@class='_2-uG6-']/child::a[contains(text(),'DARSHANAM')]")
		private WebElement productText;
		
		
		
		public ProductPage(WebDriver driver) {
			PageFactory.initElements(driver, this);   
		}
		
		public void clickAddToCart() {
			addToCartButton.click();
		}
		
		public void switchWindow(SeleniumUtility seleniumUtility) {
			seleniumUtility.switchWindow();
			addToCartButton.click();
			
		}
		public String productInCart() {
		 return productText.getText().trim();
		
		}
		
		

	}

