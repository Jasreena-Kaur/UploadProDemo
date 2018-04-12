package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageTitle {

	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String ExpectedTitle="Facebook-log in or sign up";
		String ActualTitle="";
		//driver.navigate().to("http://www.facebook.com");
		//driver.navigate().back();
		ActualTitle=driver.getTitle();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PageTitle pp=new  PageTitle();
		 pp.launch_Browser();

}
}