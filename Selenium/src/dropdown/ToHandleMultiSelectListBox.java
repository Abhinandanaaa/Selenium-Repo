package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));//select tag address
		
		Select priceSelcet=new Select(priceListbox); //object creation of Select class
		priceSelcet.selectByIndex(1);
		priceSelcet.selectByValue("299");
		priceSelcet.selectByVisibleText("INR 200 - INR 299 ( 3 ) "); 
		
		
		
		Thread.sleep(2000);
		priceSelcet.deselectAll();
		priceSelcet.deselectByIndex(1);
		priceSelcet.deselectByValue("299");
		priceSelcet.deselectByVisibleText("INR 200 - INR 299 ( 3 ) "); //deselect is only availble for multi select, if we try for single select-[unsupported option exception]
		//if we select the range that is not there, no value found something exception, check it.
		
		
		
		
		

	}

}
