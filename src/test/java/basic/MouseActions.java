package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		//Slider URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Creating obj for ACtions class
		Actions a=new Actions(driver);
		
		//WebElement w1=driver.findElement(By.xpath("//a[text()='Widgets']"));
		//WebElement w2=driver.findElement(By.xpath("//a[text()=' AutoComplete ']"));
		//Mouse Over
		//a.moveToElement(w1).moveToElement(w2).build().perform();		
		
		//Double click
		//a.doubleClick(w1);	
		
		//Right click
		//a.contextClick().build().perform();
		
		//WebElement d1=driver.findElement(By.id("draggable"));
		//WebElement d2=driver.findElement(By.id("droppable"));
		//Drag and Drop
		//a.dragAndDrop(d1, d2).build().perform();
		
		
		//WebElement s=driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		//Slide
		//Horizontal: Y axis 0
		//Vertical : X axis 0
		//a.dragAndDropBy(s, 100, 0).build().perform();
		
		//Resizable
		
		WebElement r=driver.findElement(By.xpath("//div[@id='resizable']/h3/following-sibling::div[3]"));
		
		a.dragAndDropBy(r,4,6).build().perform();
		
		
	}

}
