package TestNG;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.utility.Xls_Reader;

public class HrmLogin {
	
	public static WebDriver driver;
	WebElement menu1, menu2,menu3;
	String title;

	@BeforeSuite
		public void launch_Browser1()
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.get("http://172.16.10.77/hrm/login.php");
			System.out.println(driver.getTitle());
		}

@Test
	public void launch_Browser()
	{
		
		
		Xls_Reader reader= new Xls_Reader("D:\\Demo.xls");
		int count = reader.getRowCount("login");
		System.out.println(count);
		System.out.println("count is:"+count);
		for(int row=2;row<=count;row++)
		{
		String Run= reader.getCellData("login","Run",row);
		System.out.println(Run);
	//	AssertJUnit.a
		if(Run.equalsIgnoreCase("on"))
		{
			reader.setCellData("login", "Status", row, "passed");
		}
		else if(Run.equalsIgnoreCase("off"))
		 {
			
	       reader.setCellData("login", "Status", row, "Failed");
         }
		else
		{
			continue;
		}

		String uname= reader.getCellData("login","Testdata1",row);
		System.out.println(uname);
		String pass= reader.getCellData("login","Testsdata2",row);
		System.out.println(pass);
		System.out.println("....................");		
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
//		WebElement container=driver.findElement(By.id("rightMenu"));
//		driver.switchTo().frame(container);
//	    driver.findElement(By.name("chkLocID[]")).click();
	System.out.println("Home Page....");
	//	if(title.eq)
	//	driver.findElement(By.name("clear")).click();
//		switch(Run)
//		{
//		case "on":
//		{	
//			String uname= reader.getCellData("login","Testdata1",row);
//			System.out.println(uname);
//			String pass= reader.getCellData("login","Testsdata2",row);
//			System.out.println(pass);
//			System.out.println("....................");		
//			driver.findElement(By.name("txtUserName")).clear();
//			driver.findElement(By.name("txtUserName")).sendKeys(uname);
//			driver.findElement(By.name("txtPassword")).clear();
//			driver.findElement(By.name("txtPassword")).sendKeys(pass);
//			driver.findElement(By.name("Submit")).click();
//			driver.findElement(By.name("clear")).click();
//			break;
//		}
//		case "off":
//		{
//			System.out.println("Status:"+Run);
//		}
			
		//}
		
		}
	
}
//@Test
// public void url()
// {
//	String ch="http://172.16.10.77/hrm/login.php";
//	String ch1=driver.getCurrentUrl();/html/body/div[4]/ul/li[1]/ul/li[1]/a
//	System.out.println("ch:"+driver.getCurrentUrl());
//	AssertJUnit.assertEquals(ch, ch1);
//	System.out.println("same url");
// }
@Test
public void second() throws InterruptedException {
	Thread.sleep(5000);
	menu1= driver.findElement(By.xpath("//span[@class='drop']"));
	Actions ac= new Actions(driver);
	ac.moveToElement(menu1).build().perform();
	Thread.sleep(5000);
	menu2 = driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a"));
	Actions ac2= new Actions(driver);
//	Thread.sleep(5000);
	ac2.moveToElement(menu2).build().perform();
	
	menu3= driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[1]/a"));
	Actions ac3= new Actions(driver);
	Thread.sleep(5000);
	ac3.moveToElement(menu3).click().build().perform();
}
}
//
//

	//@AfterSuite
	// public void close()
	//{
	   //        driver.quit();
   
//}
	
			
