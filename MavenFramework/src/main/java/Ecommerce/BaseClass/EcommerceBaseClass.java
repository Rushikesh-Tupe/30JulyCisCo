package Ecommerce.BaseClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Ecommerce.Utilities.TestUtils;
import EcommerceConfiguration.ReadConfiguration;

public class EcommerceBaseClass {
	ReadConfiguration ReadConfig=new ReadConfiguration();
	public String BaseURL = ReadConfig.getBaseurl();
	public String username =ReadConfig.getusername();
	public String password =ReadConfig.getpassword();

	
	public static WebDriver driver;
	public static Logger logger;
   @Parameters("Browser")
	@BeforeMethod
	public void SetUp(String Browsernames) {
		logger=logger.getLogger("ecommerce");
		PropertyConfigurator.configure("Log4j.properties");
		if(Browsernames.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ReadConfig.getchromepath());
			driver = new ChromeDriver();
		}
		if(Browsernames.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ReadConfig.Geckodriver());
			driver = new FirefoxDriver();
		}
//		if(Browsernames.equals("Chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", ReadConfig.getchromepath());
//			driver = new ChromeDriver();
//		}
//		if(Browsernames.equals("Chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", ReadConfig.getchromepath());
//			driver = new ChromeDriver();
//		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(BaseURL);
	}
   public String getScreenshotAs(String TestCasename) throws IOException {		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String Name = "- Screenshot -"+Timestamp;
		String destination = System.getProperty("user.dir") + "/Screenshot/" + TestCasename + "" + Name + ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
			
	}
	
@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
