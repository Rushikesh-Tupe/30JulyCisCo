package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Configuration.Readconfiguration;
import Com.Ecommerce.Utilitities.TestUtils;

public class Ecommerce_BaseClass {

	Readconfiguration readconfig = new Readconfiguration();	
	public String BaseURL = readconfig.getApplicationURL();
	public String username =readconfig.getUsername();
	public String password =readconfig.getPassword();

	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeMethod
	public void SetUp() {
		
		logger = logger.getLogger("30JulyEcommerce");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(BaseURL);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
