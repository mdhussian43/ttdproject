package seleniumPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UtilitisPacakage 
{    
	
	public static void ClickOperation(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	
	}
	
	public static void AlertGenerate(WebDriver driver,String message)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("alert('"+ message +"')");
	}
 
	public static void BorderOperation(WebDriver driver,WebElement element)
 
	{
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeScript("arguments[0].style.border='2px solid red'",element);
	 js.executeScript("arguments[0].style.background='red'", element);
	}
 

	public static void BorderBackgroundcolour(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')", element);
	}
 
   public static void TakesscreenShot(WebDriver driver,String FilePath) throws IOException
 {
	 TakesScreenshot capture = (TakesScreenshot)driver;
	 File src=capture.getScreenshotAs(OutputType.FILE);
	 File DestFile= new File(FilePath);
	 FileUtils.copyFile(src, DestFile);
 }
   public static void TakesscreenShotWebElemnt(WebElement element,String FilePath) throws IOException
   {
  	 //TakesScreenshot capture = (TakesScreenshot)driver;
	 
  	 File src=element.getScreenshotAs(OutputType.FILE);
  	 File DestFile= new File(FilePath);
  	 FileUtils.copyFile(src, DestFile);
   }
	
	
	
	
	
	
	
	
	
	
}
