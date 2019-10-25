package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Web Browser
		//WebDriverManager.chromedriver().version("77.0.3865.90").setup();
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Open URL
		driver.get("http://newtours.demoaut.com/");
		
		
		System.out.println(driver.getPageSource());
		//User Name Identification
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(10000);
		String ETitle="Find a Flight: Mercury Tours:";
		
		String ATitle=driver.getTitle();
		
		
		//Validation
		if(ATitle.equals(ETitle))
		{
			System.out.println("Title Match: Test Case PASS");
		}
		
		else
		{
			System.out.println("Title doesnot match: Test Case FAIL");
		}
		
		
		//CLose browser
		driver.quit();
		

	}
}
