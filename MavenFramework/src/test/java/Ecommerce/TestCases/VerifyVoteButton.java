package Ecommerce.TestCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.VoteButton;

public class VerifyVoteButton extends EcommerceBaseClass {

	@Test
	public void verifyvote() throws IOException
	{
		VoteButton VB=new VoteButton();
		VB.EcommerceLogo1();
		logger.info("click on ecommerce logo");
		VB.VerifyVoteButton();
		logger.info("verfied vote button");
		boolean button=driver.findElement(By.id("vote-poll-1")).isDisplayed();
		if(button==true)
		{
			logger.info("button is present");
			AssertJUnit.assertTrue(true);
			
		}else
		{
			logger.info("button is not present");
			AssertJUnit.assertTrue(false);
		}
		
		
		
	}
}
