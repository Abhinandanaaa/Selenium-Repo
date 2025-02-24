package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnDataProviderfromOtherClass {//extends DataStorage cannot be used as there are plenty of data and we need only particular data
	//so we write it in attributes as key value format
	@Test(dataProviderClass=DataStorage.class,dataProvider="datasender") //@DataProvider class is used to specify the class name of @DataProvider
	public void login(String[] cred){ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
	}	

}
