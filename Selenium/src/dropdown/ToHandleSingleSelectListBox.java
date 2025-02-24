package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectListBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement monthDropdown = driver.findElement(By.id("month"));//select tag address
		
		Select monthSelect=new Select(monthDropdown); //object creation of Select class
		//monthSelect.selectByIndex(9);
		//monthSelect.selectByValue("5");
		monthSelect.selectByVisibleText("Jul"); // most preferred 

	}

}
