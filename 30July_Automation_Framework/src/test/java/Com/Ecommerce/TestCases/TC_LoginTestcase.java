package Com.Ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;

public class TC_LoginTestcase extends Ecommerce_BaseClass{

	
	@Test
	public void LoginTestCase() throws InterruptedException {
		
		logger.info("Open URL");
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		Thread.sleep(3000);

		TEL.SetUsername(username);
		System.out.println("Hello");
		logger.info("Enter user mailL");
		Thread.sleep(3000);

		TEL.SetPassword(password);
		logger.info("Enter User password");

		Thread.sleep(3000);
		TEL.ClickButton();
		logger.info("Clicked on longin button");
		Thread.sleep(3000);

		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("Login successfully");

		}
		else {
			Assert.assertTrue(false);
			logger.info("Login failed");

		}
		
	}
}
