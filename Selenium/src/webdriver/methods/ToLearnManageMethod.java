package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//window interface
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize(); // to maximize the screen to test all the features, it is a precondition of a test script
		Thread.sleep(2000);
		driver.manage().window().minimize(); // to minimize the screen
		Thread.sleep(2000);
		driver.manage().window().fullscreen(); // full screen wont allow you to navigate, like go back, front.
	}

}
