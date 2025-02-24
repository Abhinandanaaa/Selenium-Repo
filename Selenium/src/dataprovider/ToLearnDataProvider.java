package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	@DataProvider
	//public void datasender(){
	public String[][] datasender() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;// redline appears as we have given void as return type and it should be string
		
	}
	
	@Test(dataProvider="datasender")//here data provider is an attribute which is used to receive data
	public void login(String[] cred){ //as we need one set of string data at a time, we have used string[] with referennce variable
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		/*driver.findElement(By.id("email")).sendKeys("admin");// just hardcoding the data
		driver.findElement(By.id("password")).sendKeys("admin");// just hardcoding the data*/
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		
		
	}

}
