package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {

	
	     @BeforeSuite
	     void bs()
	     {
	    	 System.out.println("This is before suite...");
	    	 
	     }
	     @AfterSuite
	     void as()
	     {
	    	 System.out.println("this is after suite...'");
	    	 
	     }
	     @BeforeTest
	     void bt()
	     {
	    	 System.out.println("this is before test method....");
	    	 
	     } 
	     @AfterTest
	     void at()
	     {
	    	 System.out.println("this is after test method...");
	    	 
	     }
	     @BeforeClass
	     void bc()
	     {
	    	 System.out.println("this is before Class method...");
	    	 
	     }
	     @AfterClass
	     void ac()
	     {
	    	 System.out.println("this is after Class method...");
	    	 
	     }
	     @BeforeMethod
	     void bm()
	     {
	    	 System.out.println("this is before method...");
	    	 
	     }
	     @AfterMethod
	     void am()
	     {
	    	 System.out.println("this is after method...");
	    	 
	     }
	     
	     @Test(priority=1)
	     void tm1()
	     {  
	   	  System.out.println("This is Test Method1.....");
	     }
	     @Test(priority=2)
	     void tm2()
	     {  
	   	  System.out.println("This is Test Method2.....");
	     }
	     

	
	
	
	
	
}
