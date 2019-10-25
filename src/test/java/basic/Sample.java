package basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		//Slider URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String destination=Utils.captureScreen(driver,"Error");
		
		System.out.println(destination);
		
		driver.quit();

	}

}
