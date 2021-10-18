package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver ldriver;
	public PageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//button[normalize-space()='I am a Fresher']") WebElement button;
	@FindBy(id="fname") WebElement regname;
	@FindBy(id="email") WebElement email;
	@FindBy(xpath="//input[@name='password']") WebElement pwd;
	@FindBy(xpath="//input[@name='number']") WebElement mob;
	@FindBy(xpath="//input[@class='sugInp']") WebElement city;
//WebDriver driver;
	
public void clickButton()
{
	button.click();
}
	
public void setName(String Name)
{
	regname.sendKeys(Name);
}
	
public void setEmail(String Emailid)
{
	email.sendKeys(Emailid);
}

public void setPassword(String Password)
{
	pwd.sendKeys(Password);
}

public void setMob(CharSequence Mobile)
{
	mob.sendKeys(Mobile);
}

public void setCity(String City)
{
city.sendKeys(City);	
}


}