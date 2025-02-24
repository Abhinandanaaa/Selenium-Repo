package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToLearnCrossBrowserTestingWithParameter {
public WebDriver driver;//making it as global variable to access in every block
	@Parameters("Browser") // parameters and not parameter, first we need to create suite file then add annotation
	//we cannot add annotation before creating suite file.
	@Test

public void Launch(@Optional("chrome")String browserName) { //@optional is hardcoding when we run test script instead of test suite here, if we didnt use optional we get TESTNG Exception
		
		if(browserName.equalsIgnoreCase("Chrome")){//EQUAL IGNORE CASE  ignores the case given in Suite file, capital or small
			driver=new ChromeDriver();// accessing webdriver directly from global variable
		
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.instagram.com/?hl=en");
}



}
