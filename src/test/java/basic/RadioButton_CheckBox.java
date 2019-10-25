package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//Set Wait
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    //Maximize window
	    driver.manage().window().maximize();
	    
	    //Verify radio button is selected or not
	    
	   
	    System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    Thread.sleep(10000);
	    System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
		
	  
	    System.out.println(driver.findElement(By.xpath("//label[text()='Tuesday']")).isSelected());
	    driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
	    Thread.sleep(5000);
	    System.out.println(driver.findElement(By.xpath("//label[text()='Tuesday']")).isSelected());
	    
	    if(driver!=null) {
	    driver.quit();
	    }
	    
	    
	}

}
