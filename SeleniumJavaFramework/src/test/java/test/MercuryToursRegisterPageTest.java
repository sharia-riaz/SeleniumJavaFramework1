package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MercuryToursFlightsPageObjects;
import pages.MercuryToursRegisterPageObjects;
import pages.MercuryToursSignonPageObjects;

public class MercuryToursRegisterPageTest {

	WebDriver driver=null;
	MercuryToursRegisterPageObjects regstrpageobj;
	MercuryToursSignonPageObjects signonpageobj;
	MercuryToursFlightsPageObjects flightobj;
	
	@BeforeTest
	public void setUp()
	{
		String projectPath=System.getProperty("user.dir");
	    System.out.println("project path is "+projectPath);
	    System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/newtours/register.php");
	    
	}
	@Test(priority=0)
	public void mercuryToursRegisterTest()
	
	{	    
		regstrpageobj=new MercuryToursRegisterPageObjects(driver);
		
	    regstrpageobj.setfirstname("Sharia");
	    regstrpageobj.setlastname("Riaz");
	    regstrpageobj.setphone("12345678");
	    regstrpageobj.setemail("ss@gmail.com");
	    regstrpageobj.setaddress("f10");
	    regstrpageobj.setcity("Delhi");
	    regstrpageobj.setstate("Delhi");
	    regstrpageobj.setpostalcode("208001");
	    regstrpageobj.setdrpcountry("INDIA");
	    regstrpageobj.setusername("shariariaz");
	    regstrpageobj.setpassword("Infosys135");
	    regstrpageobj.setconfirmPassword("Infosys135");
	    regstrpageobj.clicksubmit();
	}
	
	@Test(priority=1)
    public void mercuryToursSignonTest()
	
	{	    
	  signonpageobj=new MercuryToursSignonPageObjects(driver);
	  
	    signonpageobj.clickonSigin();
	    signonpageobj.setusername("shariariaz");
	    signonpageobj.setpassword("Infosys135");
	    signonpageobj.clickonSubmit();
	    
	} 
 
	@Test(priority=2)
     public void mercuryToursFlightsTest()
	 {
	 
	  flightobj=new MercuryToursFlightsPageObjects(driver);
	   
	    flightobj.clickOnFlights();
	    flightobj.clickOnType();
	    flightobj.setPassengers("1");
	    flightobj.setfromPort("London");
	    flightobj.setfromMonth("August");
	    flightobj.setfromDay("fromDay");
	    flightobj.settoPort("Frankfurt");
	    flightobj.settoMonth("August");
	    flightobj.settoDay("15");
	    flightobj.clickOnServiceClass();
	    flightobj.clickContinue();
	}
	   
} 
