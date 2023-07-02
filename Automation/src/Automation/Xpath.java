package Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] aa) throws InterruptedException{
   
        WebDriver driver;
        Scanner browser= new Scanner(System.in);
       System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
       // System.setProperty("webdriver.edge.driver", "D:\\java\\Automation\\Automation\\drivers\\msedgedriver.exe");
        
        
        System.out.println("For Chrome : 1");
        System.out.println("For Edge : 2");
        System.out.println("Enter choose Browser");
        int chooseBrowser = browser.nextInt();
        
        switch (chooseBrowser) {
            case 1 -> {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.flipkart.com/");
              
                driver.findElement(By.xpath("//button[contains(text() , '✕')]")).click();
                Thread.sleep(2000);
//                WebElement link = driver.findElement(By.xpath("//div[contains(text() , 'Electronics')]"));
//                System.out.println(link.getText());
//                link.click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//div[contains(text() , 'Mobiles')]")).click();
                driver.findElement(By.xpath("//input[@name=\"q\"]")).clear();
                driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("one plus nord CE3 Lite");
                driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
                
                
                
                driver.close();
            }
            case 2 -> {
                driver = new EdgeDriver();
                
               Thread.sleep(2000);
               Point pos= new Point(100,100);
               
                driver.manage().window().setPosition(pos);
                System.out.println(driver.manage().window().getPosition());
                driver.get("https://www.flipkart.com/");
                
                driver.quit();
            }
            default -> System.out.println("choose any");
        }
    }

}
