import org.testng.Assert;
import org.testng.annotations.Test;

import Repository.AddToCart;
import Repository.ProductPage;
import Utility.BaseClass;

public class FlipkartF extends BaseClass {
		
		@Test
		public void addProduct()  {
			
			String Product  =workBookUtility.getDataFromExcel(1, 1, "flipkart");
			AddToCart cart= new AddToCart(driver);
			cart.searchClick();
			cart.clickOnSearchProducts(Product);
			String actual = cart.winterHeaterProduct();
			System.out.println(actual);
			cart.clickOnProduct();
			
			ProductPage page= new ProductPage(driver);
			page.switchWindow(seleniumUtility);
			String expected = page.productInCart();
			System.out.println(expected);
			Assert.assertEquals(actual, expected);
		   

			
				}

	}
