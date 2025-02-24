package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNgwithsteps {
	
	@Test (priority=1,enabled=false)//enabled=false, skips wont count here, it wont event consider for execution, completely disable execution
	public void register(){
		WebDriver driver=new ChromeDriver();                                    
		driver.manage().window().maximize();                                    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register test case executed",true);
		
	}
	
	@Test (priority=2, invocationCount = 4, threadPoolSize = 2) //if it is -5 and -4 priority, lower value always gets executed first
	public void login() {
		WebDriver driver=new ChromeDriver();                                    
		driver.manage().window().maximize();                                    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login test case executed",true);
	}

}
