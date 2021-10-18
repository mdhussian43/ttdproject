package testNGPractice;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.icu.impl.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ExcelRead;

public class ParllelTestNG {
	WebDriver driver;
	
	//String browser;
	@BeforeTest
	public void setUp()
	{
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/account/createaccount?othersrcp=16201&err=1");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
/*@Parameters({"browser","url"})
	public void setup(String browser,String url)
	{
		
	if(browser.equals("chrome"))
	{
     WebDriverManager.chromedriver().setup();
	}
     else if(browser.equals("firefox"))
     {
    	 WebDriverManager.firefoxdriver().setup();
     }
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	}*/
	
	
	
	@Test(dataProvider="Regdata")
	//@Parameters({"browser","url"})
	public void registrationPage(String Name,String Emailid,String Password,CharSequence Mobile,String City)
	
	{
		PageObject p=new PageObject(driver);
		p.clickButton();
		p.setName(Name);
		p.setEmail(Emailid);
		p.setPassword(Password);
		p.setMob(Mobile);
		p.setCity(City);
		

		//Assert.assrt(true);
		
	}
	
	
	@DataProvider
	public Object[][] registrationPage() throws IOException
	{
		String path=".\\RegPage.xlsx";
		ExcelRead excel =new ExcelRead(path); 
		int tolrows=excel.getRowcount("sheet1");
		int tolcolnms=excel.getCellcount("sheet1", 1);
		
		Object Regdata[][]=new Object[tolrows][tolcolnms];
		for(int i=1;i<=tolrows;i++)
		{
			
			for(int j=0;j<=tolcolnms;j++)
			{
				Regdata[i-1][j]=excel.getCellData("sheet1", i, j);
				
			}
		}
		
		return Regdata;
		
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
