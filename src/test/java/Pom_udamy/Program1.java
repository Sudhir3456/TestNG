package Pom_udamy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Program1 {

	WebDriver driver;
	
	@BeforeClass
	void setUP()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void signInTestcase()
	{
 		RediffHomePage rhp=new RediffHomePage(driver);
		rhp.signIn().click();
		
		RediffSignInPage rsp=new RediffSignInPage(driver);
		rsp.userName().sendKeys("abc");
		rsp.password().sendKeys("123");
		rsp.SignInButton().click();
		
	//	Assert.assertTrue(driver.getCurrentUrl().contains("https://www.rediff.com/"));
		
 	}
	
	@AfterClass
	 void tearDown() 
	 {
		 driver.quit();
		 
		 
	 }
	

	
	
}
