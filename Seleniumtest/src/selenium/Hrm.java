package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hrm {
	
	public void launch_Browser1()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://172.16.10.77/hrm/login.php");
		//driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		//driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.name("clear")).click();
		//WebElement container=driver.findElement(By.id("rightMenu"));
		//driver.switchTo().frame(container);
		driver.findElement(By.name("loc_code"));
	    //driver.findElement(By.name("chkLocID[]")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hrm hh=new Hrm();
       hh.launch_Browser1();
	}

}
