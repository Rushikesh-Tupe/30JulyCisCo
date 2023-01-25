package Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.BaseClass.EcommerceBaseClass;

public class EcommerceLoginPage extends EcommerceBaseClass {
	@FindBy(id = "Email")
	public WebElement Username;

	@FindBy(id = "Password")
	public WebElement Password;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement LoginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	public WebElement Logout;

	public EcommerceLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void SetUsername(String Uname) {

		Username.sendKeys(Uname);
	}

	public void SetPassword(String Pass) {
		Password.sendKeys(Pass);
	}

	public void ClickButton() {
		LoginBtn.click();
	}

	public void Logout() {
		Logout.click();
		
	}
}
