package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	
	@Test(priority=1)
	  public void openapp()
	  {  
		  System.out.println("Open the application.....");
		  Assert.assertTrue(false);
	  }
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	  public void login()
	  {  
		  System.out.println("Login  to application.....");
		  Assert.assertTrue(true);

	  }
	
	@Test(priority=3,dependsOnMethods= {"login"})
	  public void search()
	  {  
		  System.out.println("Search to application.....");
		  Assert.assertTrue(true);

	  }
	@Test(priority=4,dependsOnMethods= {"login"})
	  public void advsearch()
	  {  
		  System.out.println("AdvSearch to application.....");
		  Assert.assertTrue(true);

	  }
	@Test(priority=5,dependsOnMethods= {"login"})
	  public void logout()
	  {  
		  System.out.println("logout to application.....");
		  Assert.assertTrue(true);

	  }



}
