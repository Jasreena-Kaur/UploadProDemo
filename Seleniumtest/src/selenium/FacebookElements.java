package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookElements {

	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.navigate().to("http://www.facebook.com");
		//driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("jasreena");
		driver.findElement(By.name("lastname")).sendKeys("bains");
		driver.findElement(By.name("reg_email__")).sendKeys("jasreenakaur05@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jasreenakaur05@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1@jasreenabains");
		//driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).sendKeys("jasreena");
		//driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).sendKeys("bains");
		Select sel=new Select(driver.findElement(By.name("birthday_day")));
		sel.selectByVisibleText("15");
		Select sel1=new Select(driver.findElement(By.name("birthday_month")));
		sel1.selectByVisibleText("Feb");
		Select sel2=new Select(driver.findElement(By.name("birthday_year")));
		sel2.selectByVisibleText("1991");
		driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.id("u_0_13")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookElements ff=new FacebookElements();
		ff.launch_Browser();
	}

}


