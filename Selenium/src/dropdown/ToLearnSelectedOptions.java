package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectedOptions {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
		
		
		Select priceList=new Select(priceListbox);
		priceList.selectByIndex(2);
		priceList.selectByIndex(0);
		priceList.selectByIndex(1);
		//priceSelect.selectByVisibleText("Jul");
		
		
		
		String firstSelectedoption = priceList.getFirstSelectedOption().getText();
		System.out.println(firstSelectedoption);
		

	}

}
