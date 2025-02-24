package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass{
	
	@Test
	
	public void ClickOnComputer() {
		
		driver.findElement(By.partialLinkText("Computers")).click();
		if(driver.getTitle().equals("Demo Web Shop. Computers")) {// title will always be present in head tag
			Reporter.log("User Navigated to Books Page",true);
		}
		else
		{
			Reporter.log("User failed to Navigated to Books Page",true);
		}
	}
	
	

}
