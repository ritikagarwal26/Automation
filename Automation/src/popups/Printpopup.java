package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Printpopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
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
	            driver.get("file:///C:/Users/Admin/OneDrive/Desktop/print.html");
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("//button[text()=\"Print\"]")).click();
	            Thread.sleep(5000);
	            
	            Robot robot = new Robot();
	            robot.keyPress(KeyEvent.VK_ENTER);
	            
	            
	        }
	        case 2 -> {
	            driver = new EdgeDriver();
	            driver.manage().window().maximize();
	        }
	        default -> System.out.println("choose any");
	    	}
	}

}
