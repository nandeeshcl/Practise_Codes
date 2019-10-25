package basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenSHot {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {

		// To take screen shot
		// Method 1:
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Datepicker.html");

		//Call screen shot method
		captureScreen("Error");

		driver.quit();
	}
	
	public static void captureScreen(String name) throws IOException
	{
		//To generate time format
		SimpleDateFormat formatter=new SimpleDateFormat("ddMMyyyyHHmmss");
		//To generate date
		Date date=new Date();
		
		//new screenshot name with date attached
		String screenShotName=name+" "+formatter.format(date);
		
		//Takes screen shot
		// Using TakesScreenshot Interface by calling method getScreenshotAs
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//instaed of file utils we can also use file handler
		FileHandler.copy(scr, new File("./Screenshots/"+screenShotName+".png"));
		//FileUtils.copyFile(scr, new File("./Screenshots/"+screenShotName+".png"));
		
		
	}

}
