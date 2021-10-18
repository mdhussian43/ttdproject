package seleniumPractise;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesOperations {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/personal/sbi_home.html");
		
		//How to Capture Cookies from browser
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println("Actual Size of cookies"+cookies.size());//8
		
		//How to Print cookies
		for(Cookie cookie:cookies)
		{		
			System.out.println(cookie.getName()+ "/" +cookie.getValue());
		}
		
		//How to create /add a cookie
		Cookie cookobj = new Cookie("my cookie","1234");
		driver.manage().addCookie(cookobj);
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookie After adding:"+cookies.size());//9
		
		//How to delete Specific cookie by object & Name of the cookie
		driver.manage().deleteCookie(cookobj);//need to give cookie object
		//driver.manage().deleteCookieNamed("my cookie");
	    cookies=driver.manage().getCookies();
        System.out.println("Size of cookie After Deletion:"+cookies.size());//8
        
        //How to DeleteAllCookies
        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        System.out.println("Size of cookie after deleted all:"+cookies.size());//0
        for(Cookie cookie:cookies)
		{		
			System.out.println(cookie.getName()+ "/" +cookie.getValue());
		}
        driver.quit();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
