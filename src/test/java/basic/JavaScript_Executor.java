package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {

		// JSE: interface to execute js code using webdriver

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


		// URL for Action 4
		driver.get("http://demo.automationtesting.in/");

		// Type cast driver object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Action 1:To send value
		// js.executeScript(" document.getElementById('email').value=
		// 'nandeeshclakhi@gmail.com' ");
		js.executeScript(
				" document.querySelector('input[placeholder=\"Email id for Sign Up\"]').value='nandeeshclakhi@gmail.com'  ");

		// Action 2: To Click on an element
		// js.executeScript(" document.querySelector('#enterimg').click() ");

		WebElement button = driver.findElement(By.id("enterimg"));
		js.executeScript(" arguments[0].click() ", button);

		// Action 3: To refresh page
		// js.executeScript(" history.go(0) ");

		Thread.sleep(5000);

		// Action 4: To create Alert Window
		// js.executeScript(" alert(' New Alert Window.. ') ");

		// Action 5: To fetch the value (Text)
		//String signInTest = js.executeScript(" return document.getElementById('btn2').innerHTML  ").toString();
		//System.out.println("Visible Text = " + signInTest);

		// Action 6: To get Title, Domain Name and URL
		//String title = js.executeScript(" return document.title  ").toString();
		//System.out.println("Title of the page is = " + title);

		//String DomainName = js.executeScript("return document.domain ").toString();
		//System.out.println("Domain name of the site = " + DomainName);

		//String url = js.executeScript(" return document.URL ").toString();
		//System.out.println("URL of the site = " + url);

		// Action 7: Scroll by specific pixel, Scroll till end of page and Scroll to
		// specific element
		// js.executeScript(" window.scrollBy(0,500)");

		// js.executeScript(" window.scrollBy(0,document.body.scrollHeight) ");

		// js.executeScript(" document.getElementById('Skills').scrollIntoView() ");

		// Action 8: navigate back and forward
		//js.executeScript(" window.history.back()");

		//js.executeScript(" window.history.forward()");

		// Action 9: To Click on Hidden Element
		// js.executeScript(" arguments[0].click() ", element);

		driver.quit();
	}

}
