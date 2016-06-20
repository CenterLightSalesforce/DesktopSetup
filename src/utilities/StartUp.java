package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class StartUp {
	public static WebDriver driver=null;
		
	
	@BeforeSuite
	public void tearUp(){
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/?gws_rd=ssl");
	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();
	}
	
	

}
