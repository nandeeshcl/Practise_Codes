package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUsing_JS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Datepicker.html");

		// Type cast driver object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Action 1:To send value using ID
		js.executeScript("   document.getElementById('datepicker1').value='09/12/2017'    ");
		
		driver.quit();

	}

}
