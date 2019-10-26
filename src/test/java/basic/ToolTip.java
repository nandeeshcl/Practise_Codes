package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/social-icon.html");

		WebElement w = driver.findElement(By.xpath("//a[@class='github']"));

		String toolTipText = w.getAttribute("title");
		System.out.println(toolTipText);

		driver.close();
	}

}
