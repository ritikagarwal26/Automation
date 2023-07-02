package Automation;

import org.openqa.selenium.manager.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	

	public static void main(String[] args) throws InterruptedException {
		
		
//		String Expected = "Ankur";
//		String Expected = "pears";
//		String ExpectedTitle = "Amazon.com. Spend less. Smile more.";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pears Soap");
		Thread.sleep(2000);
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		String ActualpageTitle = driver.getTitle();
//		String ActualTitle = driver.findElement(By.xpath("//span[text()= \"Pears Transparent Original Soap - 4.4 Oz, 12 Pack\"]")).getText();
//		
//		Thread.sleep(4000);
//		if (ActualTitle.contains(Expected)) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
//		}
		
//		Thread.sleep(4000);
//		if(ActualpageTitle.contentEquals(ExpectedTitle)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("Fail");
//		}
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
        Thread.sleep(2000);
		driver.close();

	}

}


