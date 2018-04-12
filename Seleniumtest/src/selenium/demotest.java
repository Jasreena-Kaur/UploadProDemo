package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demotest {

	

	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.navigate().to("http://www.facebook.com");
		//driver.navigate().back();
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("email")).sendKeys("admin");
		//driver.findElement(By.name("pass")).sendKeys("admin");
		////driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin");
		// driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
		 // driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		  //driver.findElement(By.className("inputtext")).sendKeys("admin");
		  //driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		  //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("admin");
		 // driver.findElement(By.cssSelector("input.pass")).sendKeys("admin");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demotest oo=new demotest();
		oo.launch_Browser();
	}

}
