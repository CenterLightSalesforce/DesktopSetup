package testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utilities.StartUp;

public class NextPage extends StartUp{

	HomePage hm=new HomePage(driver);	
	
@Test
public void NextPage(){
	
	driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
	String logTitle=driver.getTitle();
	System.out.println(logTitle);
	
}




}
