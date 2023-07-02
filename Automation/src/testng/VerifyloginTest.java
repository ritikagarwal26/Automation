package testng;

import org.testng.annotations.Test;

public class VerifyloginTest {
  @Test
  (priority = 3)
  public void LaunchBrowser() {
	  System.out.println("browser Launched");
  }
  
  @Test
  (priority = 1)
  public void login() {
	  System.out.println("login Successful ");
  }
  
  @Test
  (priority = 2)
  public void logout() {
	  System.out.println("logout Successful ");
  }
}
