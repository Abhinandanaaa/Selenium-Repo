package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	
	@Test
	
	//as we extended base class, driver variable is inherited from base class
	
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		
		
		if(driver.getTitle().equals("Demo Web Shop. Books")) {// title will always be present in head tag
			Reporter.log("User Navigated to Books Page",true);
		}
		else
		{
			Reporter.log("User failed to Navigated to Books Page",true);
		}
		
	}

}
