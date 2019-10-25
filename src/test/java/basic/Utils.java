package basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utils {
	
	public static String captureScreen(WebDriver driver,String name) throws IOException
	{
		//To generate time format
		SimpleDateFormat formatter=new SimpleDateFormat("ddMMyyyyHHmmss");
		
		//To generate date
		Date date=new Date();
		
		//new screenshot name with date and time attached
		String screenShotName=name+" "+formatter.format(date);
		
		//Takes screen shot
		// Using TakesScreenshot Interface by calling method getScreenshotAs
		//takes screen shot and save in buffer
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//prepare dest folder
		//instaed of file utils we can also use file handler
		String dest="./Screenshots/"+ screenShotName + ".png";
		
		//copy file from source(buffer) to destination
		FileHandler.copy(scr, new File(dest));
		
		//return destination of the scrennshot
		return dest;
		
		//FileUtils.copyFile(scr, new File("./Screenshots/"+screenShotName+".png"));
		
		
	}

}
