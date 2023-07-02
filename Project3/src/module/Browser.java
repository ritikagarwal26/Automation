package module;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	static WebDriver driver = null;

	public static  WebDriver ChooseBrowser() throws Exception {

		@SuppressWarnings("resource")
		Scanner n = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Automation\\Automation\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\java\\Automation\\Automation\\drivers\\msedgedriver.exe");

		System.out.println("For Chrome : 1");
		System.out.println("For Edge : 2");
		System.out.println("Choose Browser");
		int num = n.nextInt();

		switch (num) {
			case 1 -> {
				System.out.println("Browser : Chrome");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
	//	            WebDriverWait wait = new WebDriverWait(driver, 1);
	
			}
			case 2 -> {
				System.out.println("Browser : MS Edge");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
			default -> {
//				System.out.println("Invalid Choice");
//				System.exit(1);
				throw new Exception("Invalid Choice");
			}
		}

		return driver;
	}

	public void web(String n) {
		driver.get(n);
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

}
