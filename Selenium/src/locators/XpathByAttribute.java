package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/login");
//driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhinandana@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
		//span[text()='Meta']
		//span[text()='Blog']
	
	}


}
