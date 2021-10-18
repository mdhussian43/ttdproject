package seleniumPractise;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcecutorOperations
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/personal/sbi_home.html");
		driver.manage().window().maximize();
		
		//Click Operation
		WebElement element = driver.findElement(By.linkText("Login"));
		UtilitisPacakage.ClickOperation(driver, element);
		
		//Draw a border/Highlighting for the web element
		WebElement element2 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	    UtilitisPacakage.BorderOperation(driver, element2);
	    Thread.sleep(2000);
		
	    //border for the web element + Change the background color of the web element
	    UtilitisPacakage.BorderBackgroundcolour(driver, element2);
	    
	    //TakesScreenshot 
	    String FilePath=".\\Downloads\\Mypic.png";
	    UtilitisPacakage.TakesscreenShot(driver, FilePath);
	    Thread.sleep(2000);
	    
	    //Generate Alert Message
	  	UtilitisPacakage.AlertGenerate(driver, "Login Click Successfull");
	  	driver.switchTo().alert().accept();
	  	
	  	//WebElement Capture
	  	String FilePath2=".\\Downloads\\Mypic2.png";  	
	  	WebElement EleCapture= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	  	UtilitisPacakage.TakesscreenShotWebElemnt(EleCapture, FilePath2);
	  	
	  	Thread.sleep(2000);
	  	
	  	driver.quit();
	  	
	  	
	}
	

}
