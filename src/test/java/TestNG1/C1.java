package TestNG1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	

     @Test
     void abc()
     {
    	 System.out.println("This is abc from C1...");
    	 
     }
	 @BeforeTest
     void bt()
     {
    	 System.out.println("thjs is BeforeTest method...'");
    	 
     }
	 @BeforeSuite
     void bs()
     {
    	 System.out.println("this is BeforeSuit...'");
    	 
     }

}
