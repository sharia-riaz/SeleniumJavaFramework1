package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	
	
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	 public static void googleSearchTest()
	 {
		 String projectPath=System.getProperty("user.dir");
		    System.out.println("project path is "+projectPath);
		    System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    GoogleSearchPageObjects searchPageobj=new GoogleSearchPageObjects(driver);
		    driver.get("https://www.google.com/");
		    searchPageobj.setTextInSearchBox("A B C D");
		    searchPageobj.clickSearchBtn();
		    driver.close();
	 }
}
