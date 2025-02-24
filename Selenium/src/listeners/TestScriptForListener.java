package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScriptForListener extends BaseClass {
@Test

public void login() {
	
	
	/*
	 * Reporter.log("Open the browser and navigate to URL",true);
	 * Reporter.log("Click on login link",true);
	 * Reporter.log("Enter the valid credentials",true);
	 * Reporter.log("Click on login button",true); Assert.assertEquals(true, true);
	 */

driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
driver.findElement(By.id("Password")).sendKeys("abhis@1234");
driver.findElement(By.xpath("//input[@value='Log in']")).click();


Assert.assertEquals(driver.getTitle(), "Demo Web", "Home page is not displayed");
	 Reporter.log("Home page is displayed",true);



}


}
