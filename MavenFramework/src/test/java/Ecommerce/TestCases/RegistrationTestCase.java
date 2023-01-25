package Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.Registration;

public class RegistrationTestCase extends EcommerceBaseClass
{
	@Test
	public void Registration() 
	{
Registration reg=new Registration();
reg.RegForm();
reg.SetFirstname("Rishikesh");
reg.SetLastname("Tupe");
reg.SetEmail("r@gmail.com");
reg.Setpassword("Rushi!@");
reg.Setconfirmpassword("Rushi!@");
reg.submit();

boolean result=driver.findElement(By.xpath("//div[text()=\"Your registration completed\"]")).isDisplayed();
if(result==true)
{
	logger.info("user created sucessfully");
	AssertJUnit.assertTrue(true);
	}
else
{
	logger.info("user creation failed");
	AssertJUnit.assertTrue(false);
	}
	}
}
