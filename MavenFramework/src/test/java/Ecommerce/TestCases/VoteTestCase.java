package Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.Vote;

public class VoteTestCase extends EcommerceBaseClass{
@Test
	public void votetest()
	{
		Vote V=new Vote();
		V.Ecomm();
		logger.info("click on logo");
		V.CheckBox();
		logger.info("click on checkbox of good");
		V.votebutton();
		logger.info("click on vote button");
//		V.msgverify();
//		logger.info("dispalyed Only registered users can vote.");
		boolean text=driver.findElement(By.xpath("//div[text()='Only registered users can vote.']")).isDisplayed();
		if(text==true)
		{
			logger.info("vote not done");
			AssertJUnit.assertTrue(true);
			}
		else
		{
			logger.info("vote failed");
			AssertJUnit.assertTrue(false);
			}
	}
}
