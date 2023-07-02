package popups;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class authenticationpopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	
	
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
//            driver = new ChromeDriver();
            driver.manage().window().maximize();
            
            driver.get("http://the-internet.herokuapp.com/basic_auth");
            Runtime.getRuntime().exec("D:\\java\\Automation\\Automation\\autoit\\login.exe");
            
            
        }
        case 2 -> {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
            driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]")).click();
            Runtime.getRuntime().exec("D:\\java\\Automation\\Automation\\autoit\\file upload.exe");
        }
        default -> System.out.println("choose any");
    	}
//    driver.close();
    
	}}

