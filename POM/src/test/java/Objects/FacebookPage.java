package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email") WebElement UserName;
	@FindBy(id = "pass") WebElement Password;
	@FindBy(name = "login") WebElement Login_Btn;
	
	public void Enter_Username() {
		UserName.sendKeys("Testeruser");
	}
	
	public void Enter_Password() {
		Password.sendKeys("Tester123");
	}
	
	public void VerifyLogin() {
		Login_Btn.click();
		String Title = driver.getTitle();
		assertEquals(Title, "Log in to Facebook");
	}
}
