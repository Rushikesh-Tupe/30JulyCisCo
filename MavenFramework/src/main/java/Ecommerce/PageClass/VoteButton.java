package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class VoteButton extends EcommerceBaseClass
{
public VoteButton()
{
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//img[@alt=\"nopCommerce demo store\"]")
public WebElement Ecommercelogo;

@FindBy(id="vote-poll-1")
public WebElement VerifyVote;

public void EcommerceLogo1()
{
	Ecommercelogo.click();
	}

public void VerifyVoteButton()
{
	VerifyVote.isEnabled();
	}



}
