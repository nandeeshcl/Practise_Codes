package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

/*		//Dynmaic or Bootstrap dropdown
		driver.findElement(By.id("msdd")).click();

		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li/a"));

		for (WebElement w : list) {
			// System.out.println(w.getText());
			if (w.getText().equals("Bulgarian")) {

				w.click();
				break;
			}

		}
		
		//Select dropdown
		WebElement w=driver.findElement(By.id("countries"));
		Select s=new Select(w);

		//To select option
		s.selectByVisibleText("Algeria");
		
		
		//Number of options 
		List<WebElement> l= s.getOptions();
		System.out.println("Number of options are "+l.size());
		
		//Options
		for(WebElement w1:l)
		{
			System.out.println("The option are "+w1.getText());
		}
		*/
		
		Thread.sleep(5000);
		
		//AutoSuggestive dropdown
		//Case 1:
			
	/*	driver.findElement(By.xpath("//span[@id='select2-country-container']/following-sibling::span")).click();
		
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);*/
		
		//Case 2
		driver.findElement(By.xpath("//span[@id='select2-country-container']/following-sibling::span")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"select2-country-results\"]/li"));
		for(WebElement w:list)
		{
			if(w.getText().equals("India"))
			{
				w.click();
				break;
			}
		}
		
		/*driver.findElement(By.xpath("//span[@id='select2-country-container']/following-sibling::span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.xpath("//input[@class='select2-search__field']")).getText());*/
		
		
		
		

		Thread.sleep(5000);
		
		
		if (driver != null) {
			driver.quit();
		}

	}

}
