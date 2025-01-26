package TestNG2;

import org.testng.annotations.Test;

public class SignupTests {
	
	
	@Test(priority=1,groups= {"regression"})
	  public void signupByEmail()
	  {  
		  System.out.println("This is signup by email the application.....");
 	  }
	@Test(priority=2, groups= {"regression"})
	  public void signupByFacebook()
	  {  
		  System.out.println("This is signup by Facebook the application.....");
	  }
	@Test(priority=3, groups= {"regression"})
	  public void signupBytwitter()
	  {  
		  System.out.println("This is signup by twittert the application.....");
	  }


	

}
