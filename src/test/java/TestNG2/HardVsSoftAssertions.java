package TestNG2;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	    
       
	void test_hardassertions()
	{ 
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1, 2);   //hard assertion
		
		System.out.println("testing.....");
		System.out.println("testing.....");

		
	}
	void test_softassertions()
	{ 
		System.out.println("testingn.....");
		System.out.println("testingn.....");
		
        SoftAssert sa=new SoftAssert();
        
		sa.assertEquals(1, 2);   //soft assertion
		
		System.out.println("testingn.....");
		System.out.println("testingn.....");
        
        sa.assertAll();  //mandatory
        
 
		
	}
	
	

}
