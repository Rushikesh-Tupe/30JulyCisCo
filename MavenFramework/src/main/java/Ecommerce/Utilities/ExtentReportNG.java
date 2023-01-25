package Ecommerce.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportNG{
	static ExtentReports extent;
public static ExtentReports getReportObject()
{
	String Timestamp=new SimpleDateFormat().format(new Date());
	String name="ExtentReport"+Timestamp;
	String path=System.getProperty(("user.dir")+"/Reports/"+name+""+".html");
	ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
	reporter.config().setReportName("Rushikesh Tupe");
	reporter.config().setDocumentTitle("test results");

	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA Automation Engineer", "Ranjeet Kendre");
	extent.setSystemInfo("Suite name", "Regression");
	return extent;
	}
}
