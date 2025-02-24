package webdriver.methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPositionMethod {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	
	
	driver.get("https://www.instagram.com/?hl=en");
	Point position=driver.manage().window().getPosition();
	System.out.println(position);
	
	
	System.out.println(position.getX());
	System.out.println(position.getY());

	}

}
