package ngtest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTest {
 
  @BeforeSuite
  public void Launch() 
  {
	  System.out.println("Launch Browser");
  }
  @Test
  public void Login()
  {
	  System.out.println("Login to application...");
  }
  @AfterSuite
  public void Exit_Browser() 
  {
	  System.out.println("Exit Browser");
  }

}
