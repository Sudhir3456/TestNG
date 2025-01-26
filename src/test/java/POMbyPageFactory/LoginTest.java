 package POMbyPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {

	
	WebDriver driver;
	
	@BeforeClass
	void setUP()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void testLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	 void tearDown() 
	 {
		 driver.quit();
		 
		 
	 }
	
	
	 
}
