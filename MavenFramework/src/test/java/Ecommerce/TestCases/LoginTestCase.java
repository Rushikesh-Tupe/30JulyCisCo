package Ecommerce.TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.EcommerceLoginPage;

public class LoginTestCase extends EcommerceBaseClass {

	@Test
	public void Login_Test_Case() throws InterruptedException, IOException {
		logger.info("Open URL");
		EcommerceLoginPage EC  = new EcommerceLoginPage();
		EC.SetUsername(username);
		System.out.println("Hello");
		logger.info("Enter user mailL");
		Thread.sleep(3000);
		EC.SetPassword(password);
		logger.info("Enter User password");
		Thread.sleep(3000);
		EC.ClickButton();
		logger.info("Clicked on longin button");
		Thread.sleep(3000);
		if(driver.getTitle().equals("nopCommerce demo store. Login")) {
			
			Assert.assertTrue(true);
			logger.info("Login successfully");
		}
		else {
			getScreenshotAs("Login_Test_Case");
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		
	}
}
