package seleniumPractise;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {
//How to Download the files using selenium webdriver 
	
	public static void main(String[] args) 
  {
		//To store down loaded file into an folder 
		String location = System.getProperty("user.dir")+"//Downloads//";
		
		//How to Set default download loacation in chrome browser
		HashMap preferences = new HashMap();
		preferences.put("plugins.always_open_pdf_externally", true);//using for pdf dwonload
		preferences.put("download.default_directory", location);
		 
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs",preferences );
		/*
		//Firefox
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		profile.setPreference("browser.download.folderList", 2);  //0-> destop ,1->downloads ,2->desired location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions foptions= new FirefoxOptions();
		foptions.setProfile(profile);*/
		//Launch Browsers
		//System.out.println(foptions);
		System.out.println(options);
		System.out.println(preferences);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	     driver.get("https://www.selenium.dev/downloads/");
		
		WebElement IEdriver=driver.findElement(By.xpath("//a[text()='32 bit Windows IE']"));
		
		//3 ways to Scroll Down Page By using JavaScriptExcecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.ScrollBy--scroll down and up the webpage in Selenium by a specific number of pixels
		js.executeScript("window.scrollBy(0,500)");
		
		/*2.scrollIntoView---scroll down to an element until an element becomes visible
		js.executeScript("arguments[0].scrollIntoView();",IEdriver);
		
		//3.scrollBy/scrollTo---Scroll Down to Bottom 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//4.scrollTo---Scroll to Top of the page
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		//5.scrollTo/scrollBy/ to an element horizontally on the webpage
		
		js.executeScript("window.scrollTo(document.body.scrollHeiht,0)");
		js.executeScript("window.scrollBy(1000,0)");*/
		
		IEdriver.click();
		//driver.close();
		

  }

}
