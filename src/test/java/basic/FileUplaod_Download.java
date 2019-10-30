package basic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplaod_Download {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://joann-allocation-staging.impactanalytics.co/#/login");
		
		//Call 
		MyScreenRecorder.startRecording("Test");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("jamtest@impactanalytics.co");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("impactpasswordstageuser");
		driver.findElement(By.xpath("//span[text()='Login']")).click();;
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Create New Allocation')]")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elementUpload));
		*/
		
		//To upload file
		//driver.findElement(By.xpath("//input[@id='buyUploadFile']")).sendKeys("C:\\Users\\nandeesh.cl\\Desktop\\Data\\articles.xlsx");
		
		
		//To downlaod file
		driver.findElement(By.xpath("//button[contains(text(),'Download Template')]")).click();
		
		
		MyScreenRecorder.stopRecording();
		
		
	    boolean status=isFileExist("C:\\Users\\nandeesh.cl\\Desktop\\Downloads");
	
	    if(status)
	    {
	    	System.out.println("Downloaded successfully");
	    }
	    else
	    {
	    	System.out.println("Unsuccessfull Downlaod");
	    }
		
		driver.quit();

	}
	
	//To check file exist in a folder
	public static boolean isFileExist(String location)
	{
		 File f=new File(location);
		 
		 if(f.exists())
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
	
	

}
