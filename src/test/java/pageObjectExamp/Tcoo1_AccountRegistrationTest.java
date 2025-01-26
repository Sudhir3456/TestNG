package pageObjectExamp;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tcoo1_AccountRegistrationTest {

	 public WebDriver driver;
	 
	 
	 @BeforeClass
		void setUP()
		{
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//driver.get("https://demo.opencart.com/en-gb?route=account/register");
			driver.get("https://tutorialsninja.com/demo/");

			driver.manage().window().maximize();
			
		}

	     @Test
		 public void verify_account_registration() throws InterruptedException 
		 {
			 HomePage hp=new HomePage(driver);
			 hp.clickMyAccount();
			 hp.clickRegister();
			 
			 AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			 regpage.setFirsttName(randomeString().toUpperCase());
			 regpage.setLatName(randomeString().toUpperCase());
             //regpage.setFirsttName("ggdfgjdjj");
			 //regpage.setLatName("dfdjgxfgtdtrd");
			 regpage.setEmail(randomeString()+"@gmail.com");   // randomly generated the email
			 regpage.setTeliPhone(randomeNumber());
			 regpage.setPassword("y768754575");
			 regpage.setConfPassword("y768754575");
			 regpage.chechekPolicy();
			 
			// Thread.sleep(8000);
			 
			 regpage.clickContinue();

			// regpage.setFirsttName(randomeString().);
			 String Configmsg=regpage.setConfirmationMsg();
			 
			 Assert.assertEquals(Configmsg, "Your Account Has Been Created!");
			 
		 }
	     public String randomeString()
	     {
	    	String generatedstring=RandomStringUtils.randomAlphabetic(5);
			return generatedstring;
	    	 
	     }
	     
	     public String randomeNumber()
	     {
	    	String generatednumber=RandomStringUtils.randomAlphabetic(10);
			return generatednumber;
	    	 
	     }
	     
	     public String randomeAlphaNumberic()
	     { 
	    	String generatedstring=RandomStringUtils.randomAlphanumeric(3);
	    	String generatednumber=RandomStringUtils.randomAlphabetic(5);
			return (generatedstring+"@"+generatednumber);
	    	 
	     }
	     
		 
		/* @AfterClass
		 void tearDown() 
		 {
			 driver.quit();
			 
			 
		 }
	*/
	
}
