package basic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Windows.html");
		
		/*String wh=driver.getWindowHandle();
		System.out.println(wh);*/
		
		
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		
	    Set<String> l=driver.getWindowHandles();
		
		
		for(String w:l)
		{
			String title=driver.switchTo().window(w).getTitle();
			
			if(title.equals("Sakinalium | Home"))
			{
				//Actions
				System.out.println("Child Window");
			}
			
		}
		
		driver.quit();
		

	}

}
