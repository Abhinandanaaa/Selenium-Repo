package testNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG { //testNG class
	@Test
	
	public void demo() { //test case
		//test steps
		Reporter.log("Welcome to Selenium",true);
		
		// if we didn't give true as second argument, "welcome to selenium" wont printt
	}
	@Test
		public void Sample() { //test case
			//test steps
			Reporter.log("Welcome to home",true);
	}

}
