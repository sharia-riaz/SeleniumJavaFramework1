package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.ExtentReportsTest;

public class PropertiesFile {
	
	static String projectPath=System.getProperty("user.dir");
	static Properties prop=new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		//getProperties();
		
	}
	
	 public static void getProperties() 
	{
			
		try {
		    
			InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			ExtentReportsTest.browserName=browser;
			
			String url=prop.getProperty("url");
			System.out.println(url);
			ExtentReportsTest.browserName=browser;
			ExtentReportsTest.urlName=url;
			
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			
		}
		public static void setProperties() 
		{
		
		try {
			
			OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		    prop.setProperty("browser","chrome");
		    prop.store(output, null);
		  
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
		}
		
	}

	

