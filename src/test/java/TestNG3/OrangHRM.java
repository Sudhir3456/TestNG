package TestNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG3.MyListener.class)
public class OrangHRM {
	
	WebDriver driver;
	
	 @BeforeClass
     void setup() throws InterruptedException
     {      
		    driver=new ChromeDriver();  
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		    driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 			driver.manage().window().maximize();
			Thread.sleep(5000);
			    	 
     }
	
	 @Test(priority=1)
     void testLogo()
     {  
		 boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		 Assert.assertEquals(status, true);
     }
	 
     @Test(priority=2)
     void testTitle()
     {  
    	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    	 
      }
     
     @Test(priority=3)
     void testUrl()
     {  
    	 Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 
     }
     
     @AfterClass
     void tearDown()
     {

           driver.quit();    	 
     }

}

	
	


