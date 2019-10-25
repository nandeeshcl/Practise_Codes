package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//Title display
		System.out.println("Title is "+driver.getTitle());
		
		//Current URL
		System.out.println("URL is  "+driver.getCurrentUrl());
		
		WebElement tb1=driver.findElement(By.id("RESULT_TextField-1"));
		WebElement tb2=driver.findElement(By.id("RESULT_TextField-2"));
		
		//IS ENABLED 
		boolean b=tb1.isEnabled();
		System.out.println("TB1 Enable status is "+b);
		
		System.out.println("TB2 Enable status is "+tb2.isEnabled());
		
		//IS DISPLAYED
		boolean b1=tb1.isDisplayed();
		System.out.println("TB1 Display status is "+b1);
		
		System.out.println("TB2 Display status is "+tb2.isDisplayed());
		
		//IS SELECTED
		WebElement rb2=driver.findElement(By.xpath("//input[@id='RESULT_RadioButton-7_1']"));
		
		
		System.out.println("Befor Click "+rb2.isSelected());
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",rb2);
		
		System.out.println("After Click "+rb2.isSelected());
		
		Thread.sleep(5000);
		
		//IS PRESENT
		int size=driver.findElements(By.xpath("//input[@id='RESULT_RadioButton-7_1']")).size();
		
		if(size>0)
		{
			System.out.println("Size is "+size);
			System.out.println("Element Present...");
		}
		
		driver.quit();

	}

}
