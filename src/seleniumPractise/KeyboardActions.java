package seleniumPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://apmktgcto.attendance.gov.in/");
      driver.manage().window().maximize();
      WebElement btn =driver.findElement(By.xpath("//button[@type='button']"));
      WebElement orgreg =driver.findElement(By.xpath("//a[text()=' Organization Registration']"));
      WebElement  acitivity=driver.findElement(By.xpath("//h3[text()='Attendance Activity']"));
      WebElement  login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
      
      //Mouse operations
      Robot rb = new Robot();
      Actions act= new Actions(driver);
      act.click(btn).perform();//Click on Selected Element
      act.doubleClick(acitivity).perform();//Double click on Selected Element
      act.moveToElement(orgreg).click().perform();//Cusor Move to  selected element
      //act.contextClick().click().perform();//Right Click on Current cusor position
      act.release().perform();
      //act.contextClick(login).perform();//Right Click on selected element
      driver.switchTo().newWindow(WindowType.TAB);
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
      act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
      act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Laptop Accessories']"))).perform();
      act.moveToElement(driver.findElement(By.linkText("Mouse"))).click().perform();
      
     // act.clickAndHold().release();//Click and Hold 
      //rb.keyPress(KeyEvent.VK_KP_DOWN);
     
      
      
      //t.keyDown(Keys.ARROW_DOWN);
     //ct.sendKeys(Keys.ENTER);
     //ct.keyUp(Keys.ARROW_DOWN);
     //ct.perform();
      
      
      
      
      
	}

}
