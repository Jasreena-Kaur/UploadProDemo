package TestNG;



import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assertion {
String str="Facebook Login";
@Test
public void launch_Browser()
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	String st=driver.getTitle();
    assertEquals(st,str);
	System.out.println(driver.getTitle());
}
}