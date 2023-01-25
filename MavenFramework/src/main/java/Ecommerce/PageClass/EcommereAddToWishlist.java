package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class EcommereAddToWishlist extends EcommerceBaseClass
{
public  EcommereAddToWishlist()
{
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[contains(text(),'Books')]")
	public WebElement Books;
	
	@FindBy(xpath="(//a[contains(text(),'Electronics')] )[3]")
	public WebElement Electronics;
	
	
	@FindBy(xpath="(//a[text()='Camera & photo '])[3]")
	public WebElement Cameraandphoto;
		
	@FindBy(xpath="//button[@title=\"Add to wishlist\"]")
	public WebElement DSLRClick ;
	
	@FindBy(id="add-to-wishlist-button-14")
	public WebElement AddToWishList ;
	
	@FindBy(xpath="//p[contains(text(),'The product has been added to your')] ")
	public WebElement Verify;
	
	public void Books()
	{
		Books.click();
	}
	
	public void Electronics()
	{
		Electronics.click();
	}
	
	public void CameraAndPhoto()
	{
		Cameraandphoto.click();
	}
	
	public void DSLRClick()
	{
		DSLRClick.click();
	}
	
	public void AddToWishList()
	{
		AddToWishList.click();
	}
	
	public void Verify()
	{
		Verify.isDisplayed();
	}
	
	
	
}
