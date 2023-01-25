package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class VerifyFeaturedProd extends EcommerceBaseClass {

	public VerifyFeaturedProd()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"nopCommerce demo store\"]")
	public WebElement Ecommercelogo;

	@FindBy(xpath="//strong[text()='Featured products']")
	public WebElement VeriFyProd;
	
	public void EcommLogo1() {
		Ecommercelogo.click();
	}
	public void FeatProd() {
		VeriFyProd.isDisplayed();
	}
}
