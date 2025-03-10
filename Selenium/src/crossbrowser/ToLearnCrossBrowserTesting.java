package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ToLearnCrossBrowserTesting {	
	
	public WebDriver driver;//making it as global variable to access in every block
	
	@Test

public void Launch() {
		String browserName="Safari";
		
		if(browserName.equals("Chrome")) {
			driver=new ChromeDriver();// accessing webdriver directly from global variable
		}else if(browserName.equals("Safari")) {
			driver=new SafariDriver();
		}else if(browserName.equals("Edge")) {
			driver=new EdgeDriver();
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.instagram.com/?hl=en");
}



}
