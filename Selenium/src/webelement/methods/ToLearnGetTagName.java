package webelement.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		String tagname=driver.findElement(By.linkText("Log in")).getTagName();	
		//store it in a variable called tag name and print it in console
		System.out.println(tagname);
		

	}

}
