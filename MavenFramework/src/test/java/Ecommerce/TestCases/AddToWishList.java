package Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.EcommereAddToWishlist;

public class AddToWishList extends EcommerceBaseClass{

	@Test
	public void addtowishlist() throws InterruptedException
	{
		EcommereAddToWishlist EDWL=new EcommereAddToWishlist();
				EDWL.Books();
				logger.info("use clicked on books");
				EDWL.Electronics();
				logger.info("use clicked on electronics");
				EDWL.CameraAndPhoto();
				Thread.sleep(3000);
				logger.info("use clicked on Cameraandphoto");
				Thread.sleep(3000);
				
				
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				WebElement element=driver.findElement(By.xpath("//div[@class=\"product-item\"]"));
//				js.executeScript("argument[0].click()", element);
				EDWL.DSLRClick();
				logger.info("use clicked on NikonDSLR");
				EDWL.AddToWishList();
				logger.info("use clicked on addtowishlist icon");
				EDWL.Verify();
				logger.info("The product has been added to your wishlist");
				
				
		
		
	}
}
