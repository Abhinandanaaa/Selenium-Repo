package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("9620633297");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		

	}

}
