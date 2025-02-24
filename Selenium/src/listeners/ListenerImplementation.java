package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result); 
		//default code needs to be removed and we should give our implementation
		Reporter.log("Test Script is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		String timeStamp=LocalDateTime.now().toString().replace(":", "-");
		Reporter.log("Test Script is failed",true);
		
		
		TakesScreenshot	ts = (TakesScreenshot) driver; 
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+timeStamp+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test Script is skipped",true);
	}

	
	
	
	
}
