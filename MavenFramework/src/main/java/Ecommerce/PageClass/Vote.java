package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class Vote extends EcommerceBaseClass{

	public Vote()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt=\"nopCommerce demo store\"]")
	public WebElement Ecommercelogo;
	
	@FindBy(id="pollanswers-2")
	public WebElement CheckBOX;
	
	@FindBy(id="vote-poll-1")
	public WebElement vote;
	
//	@FindBy(xpath="//div[text()='Only registered users can vote.']")
//	public WebElement msgverify;
	
	public void Ecomm()
	{
		Ecommercelogo.click();
	}

	public void CheckBox()
	{
		CheckBOX.click();
	}
	public void votebutton()
	{
		vote.click();
	}
//	public void msgverify()
//	{
//		msgverify.isDisplayed();
//	}
}
