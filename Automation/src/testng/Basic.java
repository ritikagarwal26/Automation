package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Basic {
	WebDriver driver;

	@Test
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		SoftAssert Softassert= new SoftAssert();
		String Expected = "OrangeHRM1";
		String Actual = driver.getTitle();
		Softassert.assertEquals(Expected, Actual);
		driver.quit();
		Softassert.assertAll();	}
		

	}

