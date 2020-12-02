package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import config.PropertiesFile;



public class ExtentReportsTest 
{
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test1;
    WebDriver driver=null;
	public static String browserName=null;
	public static String urlName=null;
     
     @BeforeTest
     public void setUp()
     {
    	 spark= new ExtentSparkReporter("target/Spark/Spark.html");
    	 extent=new ExtentReports();
    	 extent.attachReporter(spark);		
    	 String projectPath=System.getProperty("user.dir");
 	     System.out.println("project path is "+projectPath);
 	     PropertiesFile.getProperties();
 	     if(browserName.equalsIgnoreCase("chrome"))
 	     {
 	     System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
 	     driver=new ChromeDriver();
	 	 driver.manage().window().maximize();
 	     }
 	     else if(browserName.equalsIgnoreCase("firefox"))
	     {
	     System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
	     driver=new FirefoxDriver();
	 	 driver.manage().window().maximize();
	     }
 	     
 	    
 	  
     } 
     @Test
     public void Test()
     {
    	PropertiesFile.getProperties();
    	test1=extent.createTest("MyFirstTest for Google Search Functionality");
	    test1.log(Status.INFO, "Starting TC");
	    
	   
	    driver.get(urlName);
	    test1.pass("Navigated to Google");
	    
	    driver.findElement(By.name("q")).sendKeys("Automation");
	    test1.pass("Entered Text");
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    test1.pass("Executed");
     } 
     
     @AfterTest
     public void tearDown()
     {

	      driver.close();
	      driver.quit();
	      test1.info("Test Completed");
	      extent.flush();
	 
	}
}