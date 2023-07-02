package Automation;

import java.util.*;	
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class webdrivers {

    public static void main(String[] aa) throws InterruptedException{
    	String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
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
                driver.get("https://www.flipkart.com/");
                
                System.out.println(driver.getTitle());
                String actualTitle= driver.getTitle();
                if(actualTitle.contains(expectedTitle)) {
                	System.out.println("Pass");
                }else {
                System.out.println("fail");
                }
                driver.findElement(By.xpath("//button[text()='✕']")).click();
                Set<String> ids = driver.getWindowHandles();
                System.out.println(ids);
                for(String id:ids) {
//                	if(!id == parent) {
//                		driver.switchTo().window(id);
//                	}
                	System.out.println(id);
                }
                driver.close();
            }
            case 2 -> {
                driver = new EdgeDriver();
                
               Thread.sleep(2000);
               Point pos= new Point(100,100);
               
                driver.manage().window().setPosition(pos);
                System.out.println(driver.manage().window().getPosition());
                driver.get("https://www.flipkart.com/");
                
                
//                System.out.println(driver.getTitle());
//                System.out.println(driver.getCurrentUrl());
//                System.out.println(driver.getPageSource());
//                driver.findElement(By.xpath("//button[text()='✕']")).click();
                driver.quit();
            }
            default -> System.out.println("choose any");
        }
    }

}
