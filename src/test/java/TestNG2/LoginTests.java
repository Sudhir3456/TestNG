package TestNG2;

import org.testng.annotations.Test;

public class LoginTests {
	
	
	@Test(priority=1,groups= {"sanity"})
	  public void loginByEmail()
	  {  
		  System.out.println("This is login by email the application.....");
 	  }
	@Test(priority=2, groups= {"sanity"})
	  public void loginByFacebook()
	  {  
		  System.out.println("This is login by Facebook the application.....");
	  }
	@Test(priority=3, groups= {"sanity"})
	  public void loginBytwitter()
	  {  
		  System.out.println("This is login by twittert the application.....");
	  }


	

}
