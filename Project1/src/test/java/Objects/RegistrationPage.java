package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationPage {

WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_customer_name") WebElement Name_Text;
	@FindBy(className ="a-dropdown-prompt") WebElement CountycodeDropdown;
	@FindBy(xpath = "(//ul/li/a)[93]") WebElement Countycode;
	@FindBy(id = "ap_phone_number") WebElement PhoneNo;
	@FindBy(id = "ap_email") WebElement Email;
	@FindBy(id = "ap_password") WebElement Password;
	@FindBy(xpath = "//input[@id=\"continue\"]") WebElement ContinueBtn;
	
	public void Enter_Name(String Name) {
		Name_Text.sendKeys(Name);
	}
	
	public void CountryCodeDropdown() {
		// TODO Auto-generated method stub
		CountycodeDropdown.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception:" + e.getMessage());
		}
	}
	
	public void SelectCountryCode() {
		// TODO Auto-generated method stub
		Countycode.click();
	}
	
	public void Enter_Phone(String phone) {
		PhoneNo.sendKeys(phone);
	}

	public void Enter_Email(String email) {
		// TODO Auto-generated method stub
		Email.sendKeys(email);
	}
	
	public void Enter_Password(String Password) {
		// TODO Auto-generated method stub
		Email.sendKeys(Password);
	}
	
	public void ContinueBtnClick() {
		// TODO Auto-generated method stub
		ContinueBtn.click();
	}
}
