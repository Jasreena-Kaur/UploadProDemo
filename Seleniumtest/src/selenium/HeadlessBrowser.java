package selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {
	
	public void launch_Browser()
	{
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		//driver.navigate().to("http://www.facebook.com");
		//driver.navigate().back();
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("email")).sendKeys("admin");
		//driver.findElement(By.name("pass")).sendKeys("admin");
		//driver.findElement(By.id("loginbutton")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeadlessBrowser hh=new HeadlessBrowser();
		hh.launch_Browser();
	}

}
