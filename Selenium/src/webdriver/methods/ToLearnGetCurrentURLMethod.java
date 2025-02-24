package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentURLMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.instagram.com/?hl=en");
	
		String url=driver.getCurrentUrl(); //Return type in output is string, hence we need to declare a variable
		System.out.println(url);
		
		
		}
	

}
