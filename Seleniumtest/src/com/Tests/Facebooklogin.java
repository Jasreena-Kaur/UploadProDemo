package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Xls_Reader;




public class Facebooklogin {
	public void launch_Browser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		Xls_Reader reader= new Xls_Reader("D:\\Facebooklogin.xls");
		int count = reader.getRowCount("login");
		System.out.println("count is:"+count);
		for(int row=2;row<=count;row++)
		{
		String uname= reader.getCellData("login","username",row);
		System.out.println(uname);
		String pass= reader.getCellData("login","password",row);
		System.out.println(pass);
		System.out.println("....................");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(pass);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facebooklogin ff=new Facebooklogin();
		ff.launch_Browser();
	}

}
