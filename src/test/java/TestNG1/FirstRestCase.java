package TestNG1;

import org.testng.annotations.Test;

/*
      1) Open app
      2) Login
      3)Logout     -4 -3 -2 -1 0 1 2 3 4 5 
      
 */


public class FirstRestCase {
	
  @Test(priority=1)
  public void openapp()
  {  
	  System.out.println("opening application.....");
  }
  
  @Test(priority=2)
  public void login()
  {  
	  System.out.println("Login  to application.....");
  }
  
  @Test(priority=3)
  public void logout()
  {  
	  System.out.println("Logout from application.....");
  }
  
}
