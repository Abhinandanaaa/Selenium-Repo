package webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLeanBooleanIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//isEnabled()
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before giving input to the fields :" + loginBtn.isEnabled());
		
		
		
		driver.findElement(By.name("username")).sendKeys("9620633297");
		driver.findElement(By.name("password")).sendKeys("abhi@1234");
		
		System.out.println("After giving input to the fields :" + loginBtn.isEnabled());
		Thread.sleep(2000);
		driver.close();

	}

}
