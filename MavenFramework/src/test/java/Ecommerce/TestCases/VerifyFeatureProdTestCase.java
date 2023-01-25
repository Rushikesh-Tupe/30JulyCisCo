package Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.VerifyFeaturedProd;

public class VerifyFeatureProdTestCase extends EcommerceBaseClass {
@Test
	public void FeaturedProd()
	{
		VerifyFeaturedProd VF=new VerifyFeaturedProd();
		VF.EcommLogo1();
		logger.info("click on logo");
		VF.FeatProd();
		logger.info("check featured product");
		boolean text=driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();
		if(text==true)
		{
			logger.info("Test passed");
			AssertJUnit.assertTrue(true);
		}else
		{
			logger.info("test failed");
			AssertJUnit.assertTrue(false);
		}
	}

	
}
