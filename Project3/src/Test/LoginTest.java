package Test;
import module.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class LoginTest {
	WebDriver driver;
	@BeforeSuite
	public void browser() throws Exception {
		 driver= Browser.ChooseBrowser();
	}
  @Test
  (priority=3)
  public void valid() throws InterruptedException {
	  String mobile = "7409188505";
	  String password ="Ritik@12345";
	  Login login = new Login();
	  login.login(driver,mobile, password);
	  String Actualpage = driver.getTitle();
		System.out.println(Actualpage);
		String ExpectedPage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		if(ExpectedPage.contains(Actualpage)) {
			System.out.println("Login 1 pass");
		}else {
			System.out.println(" 1 fail");
		}
  }
  
  @Test
  (priority=2)
  public void invalidPassword() throws InterruptedException {
	  String mobile = "7409188505";
	  String password ="Ritik@1";
	  Login login = new Login();
	  login.login(driver,mobile, password);
	  String Actualpage = driver.getTitle();
		System.out.println(Actualpage);
		String ExpectedPage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		if(ExpectedPage.contains(Actualpage)) {
			System.out.println("Login 2 pass");
		}else {
			System.out.println("Login 2 fail");
		}
  }
  
  @Test
  (priority=1)
  public void invalidMobile() throws InterruptedException {
	  String mobile = "7409188";
	  String password ="Ritik@123";
	  Login login = new Login();
	  login.login(driver,mobile, password);
	  String Actualpage = driver.getTitle();
		System.out.println(Actualpage);
		String ExpectedPage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		if(ExpectedPage.contains(Actualpage)) {
			System.out.println("login 3 pass");
		}else {
			System.out.println("login 3 fail");
		}
  }
  
}
