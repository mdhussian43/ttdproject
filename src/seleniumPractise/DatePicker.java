package seleniumPractise;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args)
	{
		String url="https://www.airindia.in/";
		String dt="28";
		String dt2="10";
		String month = "August";
		String year="2021";
		//BaseClass.setup(url);
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@title='Departing']")).click();
		/*while(true)
		{
		String mnthyr=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div")).getText();
		String sp[]=mnthyr.split(" ");
		String mon=sp[0];
		String Yr=sp[1];
		if(mon.equalsIgnoreCase(month))
		{
			
		}*/
	
		//Date Selection//Departing
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td"));
		List<WebElement> retn=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td"));
		//Departing Date
		
	    for(WebElement dated:dates )
		{
	    	String adt=dated.getText();
				
			if(adt.equals(dt))
			 {
				dated.click();
				driver.findElement(By.xpath("//input[@title='Returning']")).click();
				for(WebElement r:retn)
				{
					
				String rdt=r.getText();
				
				r.click();
				break;
			
			 }
							
			}
		 }	
	}
}
	
