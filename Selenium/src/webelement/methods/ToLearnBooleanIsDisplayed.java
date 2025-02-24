package webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanIsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//isDisplayed()
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement customGender=driver.findElement(By.id("preferred_pronoun"));
		System.out.println(customGender.isDisplayed()); //it is not displayed on main page hence its false/ it should only present in main page for this boolean to be true
		driver.findElement(By.xpath("//label[text()='Custom']")).click(); // is displayed hence its true
		System.out.println(customGender.isDisplayed());
		

	}

}
