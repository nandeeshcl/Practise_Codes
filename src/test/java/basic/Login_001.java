package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_001 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		//WebElement unTB=driver.findElement(By.xpath("//span[text()='Username']"));
		/*JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		
		js.executeScript("document.getElementById('txtPassword').value='admin123';");
		
		
		WebElement pwBTM= driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click();",pwBTM );*/
		
	    /*WebElement unTB=driver.findElement(By.xpath("//span[text()='Username']"));
	    unTB.sendKeys("Admin ");
	    
	    Thread.sleep(5000);
	    
	    
	    
	    
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();*/
		
		
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		String eTitle="OrangeHRM";
		String aTitle=driver.getTitle();
		
		if(eTitle.equals(aTitle))
		{
			System.out.println("Test Case PASSED");
		}
		
		else
		{
			System.out.println("Test Case FAILED");
		}
		
		
		if(driver!=null)
		{
			driver.quit();
		}
			
		
	}

}
