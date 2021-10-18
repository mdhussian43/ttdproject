package seleniumPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.monsterindia.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
	
	//By Using Send Keys ---- when 'title = file' in HTML page of that element 
	    //driver.findElement(By.id("file-upload")).sendKeys("D:\\MDH\\New folder\\LAKISHA N_3Years.docx");
	   WebElement uploadbutton=driver.findElement(By.id("file-upload"));
	   
	   //click an web window based element by using JavascriptExecutor interface
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();",uploadbutton);
	   
	   // click an web window based element by using Actions class(mouse related actions)
		Actions a=new Actions(driver);
		a.moveToElement(uploadbutton).click().perform();
		
	   //Upload by using Robot class
	  String file="D:\\MDH\\New folder\\LAKISHA N_3Years.docx";
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}

}
