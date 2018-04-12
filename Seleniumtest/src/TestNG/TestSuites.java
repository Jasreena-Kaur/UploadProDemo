package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import com.utility.Xls_Reader;

public class TestSuites {
	public static WebDriver driver;
@BeforeSuite
	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

@AfterSuite
 public void close()
        {
	           driver.quit();
		}
		
}
