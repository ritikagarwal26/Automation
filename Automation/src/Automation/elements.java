package Automation;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class elements {

	public static void main(String[] aa) throws InterruptedException{
   
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
                driver.get("https://www.google.com/");
//                driver.findElement(By.xpath("//button[text() = \"✕\"]")).click();
                driver.findElement(By.xpath("//textarea[@name=\"q\"]")).clear();
                driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("selenium");
//                driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
                Thread.sleep(5000);
                List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(), \"selenium\")]"));
                
                for(WebElement suggest1:list){
                	System.out.println(suggest1.getText());           
               
				if(suggest1.getText().contains("testing"))
                {
                	suggest1.click();
                	Thread.sleep(3000);
                	break;
                	
                	
                }}
            }
//                driver.close();
        
            
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
