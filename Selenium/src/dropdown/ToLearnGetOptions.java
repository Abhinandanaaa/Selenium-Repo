package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement priceListbox=driver.findElement(By.id("month"));
		
		Select priceSelect=new Select(priceListbox);
		List<WebElement> allOptions = priceSelect.getOptions();
		System.out.println(allOptions.size());// print size
		//System.out.println(allOptions);// print all options address
		
		//if we need to give it in list one after the other and not in one line, we need to use for each loop
		
		for(WebElement ele:allOptions) {
			System.out.println(ele);// this gives all the address one line after another
			System.out.println(ele.getText());// this line gives all the values in it
			
		}
		
		
		
		
	}

}
