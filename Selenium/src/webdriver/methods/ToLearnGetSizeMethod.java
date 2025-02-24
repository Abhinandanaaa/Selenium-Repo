package webdriver.methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSizeMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // we have to always write 9 and 10th line as coding standards
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Dimension  size=driver.manage().window().getSize();
		System.out.println(size);
		
		
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
