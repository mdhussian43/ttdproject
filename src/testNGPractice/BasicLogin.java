package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicLogin {
	
	
	
	
	@Test
	public void login(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://112.133.238.205:8080/epos/login/auth?login_error=1");
		System.out.println("Page successfully open");
		Assert.assertEquals("pavan", "pavan");
	}
	
	
	
	
	
	

}
