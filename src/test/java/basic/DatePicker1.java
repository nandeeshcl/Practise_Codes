package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// driver.get("https://testautomationpractice.blogspot.com/");

		// URL
		driver.get("https://testautomationpractice.blogspot.com/");

		String month = "November 2019";
		String day = "25";

		driver.findElement(By.id("datepicker")).click();


		while (true) {

			String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			if (text.equals(month)) {
				break;
			} else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}

		}

		// CLick on day
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));

		for (WebElement w : list) {
			// System.out.println(w.getText());

			if (w.getText().equals(day)) {
				w.click();
			}
		}

	}

}
