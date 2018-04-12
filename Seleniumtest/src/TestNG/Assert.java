package TestNG;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Assert {
  String str="Facebook Login";
  @Test
	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String st=driver.getTitle();
		AssertJUnit.assertEquals(str, st);
		System.out.println(driver.getTitle());
	}
}
