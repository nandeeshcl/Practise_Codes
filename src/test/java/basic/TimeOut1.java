package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOut1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//FLuent wait with exception ignoring
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS)
						.pollingEvery(500,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
				
		
		//Page Load Time
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//Maximize window
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Thread.sleep(5000);
		
		WebElement w=driver.findElement(By.id("txtUsername1"));
		
		//Fluent Wait without exception ignoring 
		/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(500,TimeUnit.MILLISECONDS);
		*/
		
		
		
		//Explicit wait
		/*WebDriverWait wait = new WebDriverWait(driver,30); 
		wait.until(ExpectedConditions.visibilityOf(w));*/
		
		
		
		w.click();
		w.sendKeys("Admin");
		
		//Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Thread.sleep(5000);
		driver.findElement(By.id("btnLogin")).click();
		
		//Thread.sleep(5000);
		
		driver.quit();
	}

}
