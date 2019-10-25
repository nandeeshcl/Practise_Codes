package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//COunt number of links
		System.out.println("Total number of links are "+driver.findElements(By.tagName("a")).size());
		
		
		//Print all links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
	
		for(WebElement w:links)
		{
			System.out.println(w.getText());
		}
		
		//CLick on link
		//driver.findElement(By.linkText("Powered by")).click();
		
		//OPen Link in New Tab
		String newTabClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Powered by")).sendKeys(newTabClick);
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
