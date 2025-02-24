package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiple {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
		
		
		Select priceSelect=new Select(priceListbox);
		priceSelect.selectByIndex(2);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		
		
		
		
		List<WebElement> allSelectedoptions = priceSelect.getAllSelectedOptions();
		
		System.out.println(allSelectedoptions.size());// gives the size of selected options, we selected three hence output is three
		
		for(WebElement ele:allSelectedoptions) {
			//System.out.println(ele);// we get only address of the selected elements or options
			System.out.println(ele.getText());// we get value of the selected options
		}
		System.out.println(priceSelect.isMultiple());
	}

}
