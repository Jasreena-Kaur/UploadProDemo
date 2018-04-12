package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageText {

	public void launch_Browser() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.19.1-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		List<WebElement> listImages=driver.findElements(By.tagName("img"));
		System.out.println("No of images"+listImages.size());
		for(WebElement el:listImages)
		{
			String str=el.getAttribute("src");
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageText bb=new ImageText();
		bb.launch_Browser();
	}

}
