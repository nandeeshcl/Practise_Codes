package basic;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportBasic {

	// Class for extent report ExtentReports ExtentTest
	ExtentReports extent; // used to specify the name of report and location where we need to save it
	ExtentTest test; // used to generate logs

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
	
	//sample method to test pass
	
	@Test
	public void test1()
	{
		//first line
		//parameter is name of test method
		//creates node
		test  = extent.startTest("test1");
		
		//Log any info in report
		test.log(LogStatus.INFO,"STEP 1");
		
		Assert.assertTrue(true);
		
		//log status to report using test ref variable
		test.log(LogStatus.PASS, "Condition is passed");
		
		
	}
	
	//ssmaple method to test fails
	@Test
	public void test2()
	{
		test  = extent.startTest("test2");
		
		test.log(LogStatus.INFO,"STEP 2");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Condition is failed");
		
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
