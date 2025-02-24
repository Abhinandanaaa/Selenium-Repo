package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitleMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		
		//1.driver.getTitle();-- assign variable here
		//2.String actTitle=driver.getTitle();
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		if(actTitle.equals("Instagram")) 
		  {
			System.out.println("Home page is displayed");
			
		  }
		else
		  {
			System.out.println("Home page is not displyed");
		  }
		
		}
}