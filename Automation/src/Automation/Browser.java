package Automation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Browser {


static void ChooseBrowser(){
	
	
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
//            WebDriverWait wait = new WebDriverWait(driver, 1);
            
        }
        case 2 -> {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        default -> System.out.println("choose any");
    	}
	}
}
