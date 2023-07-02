package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocaterUtil{


	public static WebElement FindByName(WebDriver driver,String n) {
		return driver.findElement(By.name(n));
	}
	public static WebElement FindByClassName(WebDriver driver,String n) {
		return driver.findElement(By.className(n));
	}
	public static WebElement FindByCssSelector(WebDriver driver, String n) {
		return driver.findElement(By.cssSelector(n));
	}
	public static WebElement FindByLinkText(WebDriver driver, String n) {
		return driver.findElement(By.linkText(n));
	}
	public static WebElement FindByPartialLinkText(WebDriver driver, String n) {
		return driver.findElement(By.partialLinkText(n));
	}
	public static WebElement FindByTagName(WebDriver driver, String n) {
		return driver.findElement(By.tagName(n));
	}
	public static WebElement FindByXpath(WebDriver driver, String n) {
		return driver.findElement(By.xpath(n));
	}
	public static WebElement FindById(WebDriver driver, String n) {
		return driver.findElement(By.id(n));
	}
}
