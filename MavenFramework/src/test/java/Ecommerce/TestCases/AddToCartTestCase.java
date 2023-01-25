package Ecommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Ecommerce.BaseClass.EcommerceBaseClass;
import Ecommerce.PageClass.AddToCart;
import Ecommerce.PageClass.EcommerceLoginPage;

public class AddToCartTestCase extends EcommerceBaseClass {
	@Test
	public void addprodtocart() throws InterruptedException, IOException {
		EcommerceLoginPage EP = new EcommerceLoginPage();
		logger.info("open URL");
		EP.SetUsername(username);
		logger.info("Enter user name");
		Thread.sleep(2000);
		EP.SetPassword(password);
		logger.info("Enter password");
		Thread.sleep(2000);
		EP.ClickButton();
		logger.info("Click on lign button");
		Thread.sleep(2000);

		AddToCart AC = new AddToCart();
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		act.moveToElement(element).perform();
		logger.info("mouseover on element");
		AC.Notebook();
		logger.info("click on notebook text");
		AC.SelectMacBook();
		logger.info("select macbook");
		AC.addtocart();
		logger.info("click on add to cart");
		AC.verifymsg();
		logger.info("verify msg");
		AC.close();
		logger.info("Click on close ");

	}
}
