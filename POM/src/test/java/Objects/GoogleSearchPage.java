package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//textarea[@name='q']") public WebElement SearchBox;
	@FindBy(xpath = "//input[@name='btnK']") public WebElement Search_Btn;
	@FindBy(xpath = "//a//h3[text() = \"Facebook - log in or sign up\"]") public WebElement Facebook_Link;
	
	public void SearchGoogle(String Searchinput)  {
		
		try {
			SearchBox.sendKeys(Searchinput);
			Thread.sleep(1000);
			Search_Btn.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Exception :"+ e.getMessage());
		}
	}
	
	public void ClickFacebook() {
		try {
			Facebook_Link.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception :"+ e.getMessage());
		}
		
	}
}
