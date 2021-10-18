package seleniumPractise;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WidowOperations {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.copacargo.com/Homepage.aspx?lang=en");
		String parent=driver.getWindowHandle();
		System.out.println("parent window ID:"+parent);
		//WebElement Prod=driver.findElement(By.linkText("Products"));
		//String Tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebDriver Tab=driver.switchTo().newWindow(WindowType.TAB);
		Tab.get("https://www.copacargo.com/html/user/default.aspx?PageId=1&lang=en");
		String child=driver.getWindowHandle();
	System.out.println("Child Window ID:"+child);
	driver.switchTo().window(child);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.quit();
		
		
		
		
	}

}
