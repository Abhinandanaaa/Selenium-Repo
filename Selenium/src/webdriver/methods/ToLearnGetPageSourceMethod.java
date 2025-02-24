package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSourceMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://demowebshop.tricentis.com/");// testing application which have complete sourcecode that starts from html, usually all main applications wont have complete source code
	
		String pagesrc=driver.getPageSource();
		System.out.println(pagesrc);
	}

}
