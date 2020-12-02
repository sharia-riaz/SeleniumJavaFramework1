package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryToursSignonPageObjects {

	WebDriver driver=null;
	By signin=By.linkText("sign-in");
	By username1=By.name("userName");
	By password1=By.name("password");
	By submit1=By.name("submit");
	
	public MercuryToursSignonPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonSigin()
	{
		driver.findElement(signin).click();
	}

	
	public void setusername(String text)
	{
		driver.findElement(username1).sendKeys(text);
	}
	public void setpassword(String text)
	{
		driver.findElement(password1).sendKeys(text);
	}
	public void clickonSubmit()
	{
		driver.findElement(submit1).click();
	}
	
}
