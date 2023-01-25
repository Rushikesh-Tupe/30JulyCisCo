package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class AddToCart extends EcommerceBaseClass {

	public AddToCart()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Computers')]")
	public WebElement Computers;
	
	@FindBy(xpath="//a[contains(text(),'Notebooks ')]")
	public WebElement Notebooks;
	
	@FindBy(xpath="(//a[contains(text(),'Apple MacBook Pro 13-inch')])[2]")
	
	public WebElement SelectMacBook;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	public WebElement addtocart;
	
	@FindBy(xpath="//p[text()='The product has been added to your ']")
	public WebElement verifymsg;
	
	@FindBy(xpath="//span[@class=\"close\"]")
	public WebElement closetab;
	
	public void Notebook()
	{
		Notebooks.click();
	}
	public void SelectMacBook()
	{
		SelectMacBook.click();
	}
	public void addtocart()
	{
		addtocart.click();
		
	}
	public void verifymsg()
	{
	verifymsg.isDisplayed();
		
	}
	public void close()
	{
		closetab.click();
	}
}
