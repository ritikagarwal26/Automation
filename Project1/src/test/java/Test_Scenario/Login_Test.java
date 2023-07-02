package Test_Scenario;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import Objects.HomePage;
import Objects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	String validMobile = "7409188505";
	String valid_Password = "Ritik@12345";
	String invalidMobile = "7409188";
	String invalidPassword = "Ritik@12";

	WebDriver driver;
	LoginPage login;
	HomePage home;

	@BeforeTest

	public void BeforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 3)
	public void validMobile() {
		home = new HomePage(driver);
		login = new LoginPage(driver);
		driver.get("https://www.amazon.in/");
		home.NavigateToLogin();
		login.Enter_UserName(validMobile);
		login.VerifyMobile();
		login.Enter_Password(this.valid_Password);
		login.Verify_Sign_in();
		if (home.verifyHomePage()) {
			System.out.println("pass");
			home.Screenshot("Signin Sucessful");
		} else {
			System.out.println("Fail");
			home.Screenshot("Error Signin");
		}
	}

	@Test(priority = 2)
	public void invalidPassword() {
		home = new HomePage(driver);
		login = new LoginPage(driver);
		driver.get("https://www.amazon.in/");
		home.NavigateToLogin();
		login.Enter_UserName(validMobile);
		login.VerifyMobile();
		login.Enter_Password(invalidPassword);
		login.Verify_Sign_in();
		if (login.PasswordError()) {
			System.out.println("pass");
			home.Screenshot("Password validation sucessful");
		} else {
			System.out.println("Fail");
			home.Screenshot("Error while invalid password");
		}
	}

	@Test(priority = 1)
	public void invalidMobile() {
		home = new HomePage(driver);
		login = new LoginPage(driver);
		driver.get("https://www.amazon.in/");
		home.NavigateToLogin();
		login.Enter_UserName(invalidMobile);
		login.VerifyMobile();
		if (login.MobileError()) {
			System.out.println("pass");
			home.Screenshot("Mobile validation sucessful");
		} else {
			System.out.println("Fail");
			home.Screenshot("Error while invalid mobile");
		}
	}

//	@AfterTest
//	public void AfterTest() {
//		driver.quit();
//	}
}
