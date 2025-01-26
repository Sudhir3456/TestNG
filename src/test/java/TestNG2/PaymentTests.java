package TestNG2;

import org.testng.annotations.Test;

public class PaymentTests {
	
	
	@Test(priority=1, groups= {"sanity","regression","functional"})
	  public void paymentInRupees()
	  {  
		  System.out.println("payment in rupees.....");
 	  }
	@Test(priority=2, groups= {"sanity","regression","functional"})
	  public void paymentInDollars()
	  {  
		  System.out.println("payment in Dollars.....");
	  }
	 


	

}
