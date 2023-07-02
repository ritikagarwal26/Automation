package module;

import org.openqa.selenium.*;

public class Login {


public  void login(WebDriver driver, String mobile, String password) throws InterruptedException {

	
	Browser browser = new Browser();
	
	
	browser.web("https://www.amazon.in/");
	
	
	LocaterUtil.FindById(driver, "nav-link-accountList-nav-line-1").click();
	
	
	WebElement element = LocaterUtil.FindById(driver, "ap_email");
	element.sendKeys(mobile);

	
	LocaterUtil.FindById(driver, "continue").click();
	

	WebElement element1 = LocaterUtil.FindById(driver, "ap_password");
	element1.sendKeys(password);
	

	LocaterUtil.FindById(driver, "signInSubmit").click();
	Thread.sleep(5000);
	
}

}
