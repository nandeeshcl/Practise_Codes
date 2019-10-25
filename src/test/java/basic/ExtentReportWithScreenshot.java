package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportWithScreenshot {
	
	public static WebDriver driver;

	// Class for extent report ExtentReports ExtentTest
		ExtentReports extent; // used to specify the name of report and location where we need to save it
		ExtentTest test; // used to generate logs ,status info...

		@BeforeTest
		public void startReport() {
			// true = replace existing report
			// set location where we need to generate report
			extent = new ExtentReports("./test-output/myReport.html", true);

			// set additional information
			extent.addSystemInfo("Host_Name", "Ncl").addSystemInfo("Env", "QA").addSystemInfo("OS", "Wind");

			// load configuration file
			// path of extent config file
			//create extent-config xml file and store all configuration stuffs
			extent.loadConfig(new File("./extent.config.xml"));

		}
		
		
		@Test
		public void test1()
		{
			//first line
			//parameter is name of test method
			//creates node
			test  = extent.startTest("test1");

			
			Assert.assertTrue(false);
	
		}
		
		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException
		{
			//If result is failed 
			if(result.getStatus()==ITestResult.FAILURE)
			{
				
				
				//Call screen shot capture method, send method name and get destination address where screen shot exists
			
				String path=Utils.captureScreen(driver,"Test");
			
				test.addScreenCapture(path);
				
				//attach screen shot to report
				//test.log(LogStatus.FAIL,test.addScreenCapture(path));
				
			}
			

		}
		
		
		@AfterTest
		public void flush()
		{
			//ends the test
			extent.endTest(test);
			
			//push data to report
			extent.flush();
			
			//close the report
			extent.close();
		}	
		
		
		
}
