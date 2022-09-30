package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
		
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchProoductsTextbox;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
		private WebElement CancelMark;
		
		
		@FindBy(xpath="//button[@type='submit']/*")
		private WebElement searchIcon;
		
		
		@FindBy(xpath="//div[@class='_13oc-S']/child::div[@data-id='ROHG9R5RWDHK9V2T']/child::div[@class='_4ddWXP']/child::a[@class='s1Q9rs']")
		private WebElement firstTextWinterheater;
		
		@FindBy(xpath="//div[@class='_13oc-S']/child::div[@data-id='ROHG9R5RWDHK9V2T']/child::div[@class='_4ddWXP']/child::a[contains(text(),'DARSHANAM')]")
		private WebElement winterheaterText;
		
		
		public AddToCart(WebDriver driver) {
			PageFactory.initElements(driver, this);   
		}
		
		public void clickOnSearchProducts(String value) {
			searchProoductsTextbox.sendKeys(value);
			searchIcon.click();
		}

		public void searchClick() {
			CancelMark.click();
		}
		
		public void searchIcon() {
			searchIcon.click();
		}
		public String getWinterheaterText() {
			return firstTextWinterheater.getText().trim();
			
			
		}
		
		
		
		public String winterHeaterProduct() {
		return winterheaterText.getAttribute("title").trim();
		 
			
		}

		
		public void clickOnProduct() {
			winterheaterText.click();
			
		}
	}

