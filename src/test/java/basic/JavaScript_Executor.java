package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) {

     //JSE: interface to execute js code using webdriver
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//URL for Action 1,2,3
		//driver.get("http://demo.automationtesting.in/");
		
		//URL for Action 4
		driver.get("http://demo.automationtesting.in/");
		
		//Type cast driver object
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//Action 1:To send value using ID
		js.executeScript("document.getElementById('email').value='nandeeshclakhi@gmail.com'");
		
		//Action 2: Using css selector CLick on button
		js.executeScript("document.querySelector('#enterimg').click()");
		
		//Action 3: To refresh page
		js.executeScript("history.go(0)");
		
		
/*		//Action 4: To get text
		String signInTest=js.executeScript(" return document.getElementById('btn1').innerHTML  ").toString();
		System.out.println(signInTest);
		
		//to get title
		String title=js.executeScript(" return document.title  ").toString();
		System.out.println(title);*/
		
		//Scroll by specific pixel
		//js.executeScript(" window.scrollBy(0,500)");
		
		
		//Scroll till end of page
		//js.executeScript(" window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		//Scroll to specific element
		js.executeScript(" document.getElementById('Skills').scrollIntoView()");
		//driver.close();
		
		//to navigate back
		js.executeScript(" window.history.back()");
		
		//To navigate forward
		js.executeScript(" window.history.forward()");



		driver.quit();
	}

}
