package TestNG1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class C3 {
	
	
	 @Test
     void pqr()
     {
    	 System.out.println("This is pqr from C3...");
    	 
     }
	 
	 @AfterSuite
     void bt()
     {
    	 System.out.println("this is AfterSuit...'");
    	 
     }


}
