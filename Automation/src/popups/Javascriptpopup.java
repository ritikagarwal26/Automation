package popups;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Javascriptpopup{
	public static void main(String[] args) throws InterruptedException {
		
	
	
	
    WebDriver driver = null;
    Scanner browser= new Scanner(System.in);
    System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
    System.setProperty("webdriver.edge.driver", "D:\\java\\Automation\\Automation\\drivers\\msedgedriver.exe");
    
    
    System.out.println("For Chrome : 1");
    System.out.println("For Edge : 2");
    System.out.println("Enter choose Browser");
    int chooseBrowser = browser.nextInt();
    
    switch (chooseBrowser) {
        case 1 -> {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://nxtgenaiacademy.com/alertandpopup/");
            driver.findElement(By.name("promptalertbox1234")).click();
            Thread.sleep(5000);
            
//            driver.switchTo().alert();
            driver.switchTo().alert().sendKeys("abc");
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
//            driver.get("https://demoqa.com/alerts");
//            driver.findElement(By.id("alertButton")).click();
//            driver.switchTo().alert().accept();
            
        }
        case 2 -> {
//            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");
            driver.findElement(By.id("promtButton")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().sendKeys("abc");
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
        }
        default -> System.out.println("choose any");
    	}
//    driver.close();
    
	}}

