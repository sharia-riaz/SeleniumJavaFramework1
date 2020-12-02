package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MercuryToursRegisterPageObjects {

	WebDriver driver=null;
		
	By firstname=By.name("firstName");
	By lastname=By.name("lastName");
	By phone=By.name("phone");
	By email=By.id("userName");
	By address=By.name("address1");
	By city=By.name("city");
	By state=By.name("state");
	By postalcode=By.name("postalCode");
	By drpcountry=By.name("country");
	By username=By.name("email");
	By password=By.name("password");
	By confirmPassword=By.name("confirmPassword");
	By submit=By.name("submit");
	
	public MercuryToursRegisterPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setfirstname(String text)
	{
		driver.findElement(firstname).sendKeys(text);
	}
	
	public void setlastname(String text)
	{
		driver.findElement(lastname).sendKeys(text);
	}
	
	public void setphone(String text)
	{
		driver.findElement(phone).sendKeys(text);
	}
	
	public void setemail(String text)
	{
		driver.findElement(email).sendKeys(text);
	}
	
	public void setaddress(String text)
	{
		driver.findElement(address).sendKeys(text);
	}
	
	public void setcity(String text)
	{
		driver.findElement(city).sendKeys(text);
	}
	
	public void setstate(String text)
	{
		driver.findElement(state).sendKeys(text);
	}
	
	public void setpostalcode(String text)
	{
		driver.findElement(postalcode).sendKeys(text);
	}
	
	public void setdrpcountry(String text)
	{
		driver.findElement(drpcountry).sendKeys(text);
	}
	
	public void setusername(String text)
	{
		driver.findElement(username).sendKeys(text);
	}
	
	public void setpassword(String text)
	{
		driver.findElement(password).sendKeys(text);
	}
	
	public void setconfirmPassword(String text)
	{
		driver.findElement(confirmPassword).sendKeys(text);
	}
	
	public void clicksubmit()
	{
		driver.findElement(submit).sendKeys(Keys.RETURN);
	}
	
}
