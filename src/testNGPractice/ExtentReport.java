package testNGPractice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	@Test
	public void report()
	{
		String path = System.getProperty("user.dir")+"//test-output//index1.html";
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Testing");
		spark.config().setReportName("Regression Testing");
		extent.attachReporter(spark);
		
		/*ExtentTest test=extent.createTest("Login Test");
		test.pass("Login test passed successfully").assignDevice("chrome").createNode("Node");
		test.info("Url opned");*/
		extent.flush();
		
		
		
		
		
		
		
	}
	
	
	
	
}
