package com.iiht.evaluation.automation;

import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

/**
 * Hello world!
 *
 */
public class App 
{
	public static String baseUrl = "https://www.yaksha.com/";  
	public static String driverPath = "chromedriver.exe";  
	public static WebDriver driver ;   
    public static void main( String[] args )
    {
    	  App app = new App();
    	  String title = app.getTitle();
    	  System.out.println(title);
    	  
    }
    
    public String getTitle() {
    	// set the system property for Chrome driver      
    	System.setProperty("webdriver.chrome.driver", driverPath);  
    	// Create driver object for CHROME browser  
    	driver = new ChromeDriver();  
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
    	//driver.manage().window().maximize();  
    	driver.get(baseUrl);  
    	// get the current URL of the page  
    	String URL= driver.getCurrentUrl();  
    	System.out.print(URL);  
    	//get the title of the page  
    	String title = driver.getTitle();                  
    	
    	return title;
    }
}
