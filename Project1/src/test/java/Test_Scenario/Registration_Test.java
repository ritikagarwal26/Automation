package Test_Scenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Objects.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Test {

	String name= " ";
	String Phone= " ";
	String Email = " ";
	String Password =" ";
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	RegistrationPage Reg;
	
	@BeforeTest
	public void BeforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Restraion() {
		home = new HomePage(driver);
		login = new LoginPage(driver);
		Reg = new RegistrationPage(driver);
		driver.get("https://www.amazon.in/");
		home.NavigateToLogin();
		login.NavigateToRegistration();
		Reg.Enter_Name(name);
		Reg.CountryCodeDropdown();
		Reg.SelectCountryCode();	
		Reg.Enter_Phone(Phone);
		Reg.Enter_Email(Email);
		Reg.Enter_Password(Password);
		Reg.ContinueBtnClick();
		System.out.println("pass");
	}
	
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
