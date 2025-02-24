package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIDMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		/*driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.close();*/
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 16 pro");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click( );
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
