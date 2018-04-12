package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Xls_Reader;

public class HrmLog {

	public void launch_Browser1()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://172.16.10.77/hrm/login.php");
		System.out.println(driver.getTitle());
		Xls_Reader reader= new Xls_Reader("D:\\HrmLogin.xls");
		int count = reader.getRowCount("login");
		System.out.println("count is:"+count);
		for(int row=2;row<=count;row++)
		{
		String Run= reader.getCellData("login","Run",row);
		System.out.println(Run);
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
		driver.findElement(By.name("clear")).click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrmLog hh=new HrmLog ();
		hh.launch_Browser1();

	}

}
