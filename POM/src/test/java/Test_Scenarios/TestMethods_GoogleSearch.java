package Test_Scenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage ObjRepo;
	
	@BeforeTest
	public void BeforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	(priority = 0)
	public void SearchOperation() {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.SearchGoogle("facebook");
	}
	
	@Test
	(priority = 1)
	public void VerifyandAccessFacebook() {
		ObjRepo = new GoogleSearchPage(driver);
		ObjRepo.ClickFacebook();
	}
	@Test
	(priority = 2)
	public void VerifyLogin() {
		FacebookPage page = new FacebookPage(driver);
		page.Enter_Username();
		page.Enter_Password();
		page.VerifyLogin();
	}
	
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
