package popups;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
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
	            driver.get("https://www.yatra.com/");
//	            WebElement screen= driver.findElement(By.xpath(""));
	            TakesScreenshot ts= (TakesScreenshot)driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
//	            File source = screen.getScreenshotAs(OutputType.FILE);
	            File destination = new File("D:\\java\\Automation\\Automation\\Screenshot\\Screenshot1.png");
	            Files.copy(source, destination);
	        }
	        case 2 -> {
	            driver = new EdgeDriver();
	            driver.manage().window().maximize();
	        }
	        default -> System.out.println("choose any");
	    	}
	}

}
