package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_CLass {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("");
		
		//Handle key events
		Robot robot=new Robot();
		
		//Press down arrow
		robot.keyPress(KeyEvent.VK_DOWN);
		
		//Press tab
		robot.keyPress(KeyEvent.VK_TAB);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		

	}

}
