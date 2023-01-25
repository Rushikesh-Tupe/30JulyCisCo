package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class Registration extends EcommerceBaseClass
{
public Registration()
{
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//button[@type=\"button\"]")
public WebElement registration;

@FindBy(xpath="//input[@id=\"FirstName\"]")
public WebElement FirstName;

@FindBy(xpath="//input[@id=\"LastName\"]")
public WebElement LastName;

@FindBy(xpath="//input[@id=\"Email\"]")
public WebElement Email ;

@FindBy(xpath="//input[@id=\"Password\"]")
public WebElement Password;

@FindBy(xpath="//input[@id=\"ConfirmPassword\"]")
public WebElement ConfirmPassword ;

@FindBy(xpath="(//button[@type=\"submit\"])[2]")
public WebElement register;

public void RegForm()
{
	registration.click();
	}
public void SetFirstname(String name)
{
	FirstName.sendKeys(name);	
	}
public void SetLastname(String name)
{
	LastName.sendKeys(name);	
	}
public void SetEmail(String Emailid)
{
	Email.sendKeys(Emailid);
	}
public void Setpassword(String pass)
{
	Password.sendKeys(pass);
	}
public void Setconfirmpassword(String pass)
{
	ConfirmPassword.sendKeys(pass);
	}
public void submit()
{
	register.click();
	}

}
