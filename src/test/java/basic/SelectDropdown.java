package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		
		WebElement selectDropDown=driver.findElement(By.id("RESULT_RadioButton-9"));
		Select s=new Select(selectDropDown);
		
		
		//Display number of options
		System.out.println("Total number of dropdown options are: "+s.getOptions().size());
		
		//Display all options
		List<WebElement> list=s.getOptions();
		
		for(WebElement w:list) 
		{
			System.out.println(w.getText());
		}
		
		
		//Select options
		
		//Select by index
		s.selectByIndex(1);
		
		Thread.sleep(5000);
		
		//select by value
		s.selectByValue("Radio-2");
		Thread.sleep(5000);
		
		//select by visible text
		s.selectByVisibleText("Afternoon");
		Thread.sleep(5000);
		
		
	//	s.deselectByIndex(1);   java.lang.UnsupportedOperationException:
		
		
		driver.quit();
			

	}

}
