package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
	
	}

	public void onTestFailure(ITestResult result) {
	   String testName = result.getMethod().getMethodName();
	   System.out.println("......excute.......");
	TakesScreenshot ts = (TakesScreenshot)BaseClass.listenerDriver;
	  File src=ts.getScreenshotAs(OutputType.FILE);
	 LocalDateTime ldate= LocalDateTime.now();
	String datetime = ldate.toString().replace("", "-");
	   File trg= new File("./screenshot/"+testName+".png");
	   try {
		FileUtils.copyFile(src, trg);
	} catch (IOException e) {
		//e.printStackTrace();
	}
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
	
	}
  
}
