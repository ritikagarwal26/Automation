package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class basic {

	WebDriver driver;

	@Test(dataProvider  = "Logindata")
	public void LoginTest(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).click();
		driver.findElement(By.name("pwd")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		}
	@DataProvider(name = "Logindata")
	public String[][] getdata(){
		String Logindata[][]={
				{"admin","manager"},
				{"trainee","trainee"}
		};
		return Logindata;
	}
}
