package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MercuryToursFlightsPageObjects {

	WebDriver driver=null;
	By flights=By.linkText("Flights");
	By radio1=By.xpath("//input[@value='roundtrip']");
	By passengers=By.name("passCount");
	By fromPort=By.name("fromPort");
	By fromMonth=By.name("fromMonth");
	By fromDay=By.name("fromDay");
	By toPort=By.name("toPort");
	By toMonth=By.name("toMonth");
	By toDay=By.name("toDay");
	By radio2=By.xpath("//input[@value='Business']");
	By continue2=By.name("findFlights");
	
	public MercuryToursFlightsPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnFlights()
	{
		driver.findElement(flights).click();
	}
	public void clickOnType()
	{
		driver.findElement(radio1).click();
	}
	
	
	public void setPassengers(String text)
	{
		driver.findElement(passengers).sendKeys(text);
	}
	
	public void setfromPort(String text)
	{
		driver.findElement(fromPort).sendKeys(text);
	}
	
	public void setfromMonth(String text)
	{
		driver.findElement(fromMonth).sendKeys(text);
	}
	
	public void setfromDay(String text)
	{
		driver.findElement(fromDay).sendKeys(text);
	}
	
	public void settoPort(String text)
	{
		driver.findElement(toPort).sendKeys(text);
	}
	
	public void settoMonth(String text)
	{
		driver.findElement(toMonth).sendKeys(text);
	}
	
	public void settoDay(String text)
	{
		driver.findElement(toDay).sendKeys(text);
	}
	
	public void clickOnServiceClass()
	{
		driver.findElement(radio2).click();
	}
	
	public void clickContinue()
	{
		driver.findElement(continue2).sendKeys(Keys.RETURN);
	}
	
}	
