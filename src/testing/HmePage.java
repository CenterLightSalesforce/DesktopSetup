package testing;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utilities.StartUp;

public class HmePage extends StartUp{
	
	//StartUp driver=new StartUp(driver);
	HomePage hm=new HomePage(driver);
	@Test
	public void homePage(){
				
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Google")){
			System.out.println("Pass");
		}else{
			System.out.println("Show Stoper Found Error");
			driver.quit();
		}
		
		
		
		
		
	}
	

}
