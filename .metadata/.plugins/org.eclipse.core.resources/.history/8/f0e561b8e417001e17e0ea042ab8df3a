package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report1 {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("D:\\java\\Automation\\Project1\\test-output\\Extent-Reports\\report.html");
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("Test1");
		test1.pass("pass");
		
		ExtentTest test2 = extent.createTest("Test2");
		test2.log(Status.FAIL, "fail");
		
		extent.createTest("Test2").skip("Skipped");
				
		extent.flush();
	}
}
