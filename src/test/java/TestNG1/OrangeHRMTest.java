package TestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
     
	WebDriver driver=new ChromeDriver();
	
	 @Test(priority=1)
	  public void openapp()
	  {  
		 // System.out.println("opening application.....");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();

	  }
	 
	  @Test(priority=2)
	  public void testLogo()
	  {  
		 
         boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  System.out.println("Logo is displayed"+status); 
		  
	  }
	  
	  @Test(priority=3)
	  public void login()
	  {  
		 // System.out.println("Login  to application.....");
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		  
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		  driver.findElement(By.xpath("//button[@type='submit']")).click();

		  
		  
	  }
	  
	  @Test(priority=4)
	  public void logout()
	  {  
		 // System.out.println("Logout from application.....");
		  //driver.close();
		  driver.quit();
	  }
	  
	
	
	
	
}
