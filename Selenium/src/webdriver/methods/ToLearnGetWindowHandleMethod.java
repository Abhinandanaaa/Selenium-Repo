package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandleMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/?hl=en");
		
		String windowID=driver.getWindowHandle();// to store string we create an object and print it out in the next line.
		System.out.println(windowID);
		driver.close();

	}

}
