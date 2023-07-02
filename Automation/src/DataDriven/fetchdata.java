package DataDriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fetchdata {

	public void ValidMobile(String File) {
		

//		FileInputStream fls =new FileInputStream("D:\\java\\Automation\\Automation\\data\\Book1.xlsx");
//		Workbook workbook = WorkbookFactory.create(fls);
//		Sheet sh = workbook.getSheet("Sheet1");
//		Row rw = sh.getRow(3);
//		Cell cl = rw.getCell(3);
//		System.out.println(cl.getNumericCellValue());
		
		
		
		try {
			FileInputStream fls =new FileInputStream(File);
			Properties p = new Properties();
			p.load(fls);
			p.getProperty("Valid Mobile");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception :"+ e.getMessage());
		}
	}

}


