package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//Switch to frame
		driver.switchTo().frame("singleframe");
		
		//Actions
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sadasd");
		
		//Switch out
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}
