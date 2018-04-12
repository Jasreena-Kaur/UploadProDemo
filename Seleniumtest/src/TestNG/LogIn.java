package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogIn extends TestSuites {
	@Test
	public void login()
	      {
		    System.out.println(driver.getTitle());
		    driver.findElement(By.name("email")).sendKeys("admin");
		    driver.findElement(By.name("pass")).sendKeys("admin");
		    driver.findElement(By.id("loginbutton")).click();
	      }

}
