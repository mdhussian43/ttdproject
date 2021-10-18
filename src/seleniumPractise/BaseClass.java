package seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import utilites.ReadConfig;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	//public static String url;
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		ReadConfig rc=new ReadConfig();
		String url=rc.getApplicationURL();
		driver.get(url);
		
				
		//WebDriver driver;
			
		//WebDriverManager.chromedriver().setup();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void tearDown()
	{
		
		driver.quit();
	}
	
	
}
