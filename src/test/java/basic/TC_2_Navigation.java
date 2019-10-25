package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_Navigation {

	public static void main(String[] args) throws InterruptedException {
         
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Open URL
		driver.get("http://newtours.demoaut.com/");

		Thread.sleep(5000);
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.quit();
		
		//driver.close();
		
		
	}

}
