package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// driver.get("https://testautomationpractice.blogspot.com/");

		// URL
		driver.get("https://www.expedia.ca/");

		String month = "Dec 2019";
		String day = "25";

		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();

		// Select month
		while (true) {
			String text = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();

			if (text.equals(month)) {
				break;
			} else {
				driver.findElement(By.xpath("//div[@class='datepicker-cal']/button[2]")).click();
			}

		}

		// Date
		// WebElement
		// e=driver.findElement(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/div[2]/table/tbody/tr[4]/td[4]"));

		//Select all dates and store in list
		List<WebElement> list = driver.findElements(
				By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/div[2]/table/tbody/tr/td/button"));

		//iterate and compare one by one
		for (WebElement w : list) {

			// get text
			String d = w.getText();

			// Split and store in string array
			String[] s = d.split("\n");

			// System.out.println(s[0]);
			if (s[1].equals(day)) {
				w.click();
			}

		}

	}
}
