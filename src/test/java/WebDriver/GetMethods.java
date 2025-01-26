package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
 
		
        WebDriver driver=new ChromeDriver();
		
        //get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		driver.manage().window().maximize();
		
		//getTitle()
        System.out.println(driver.getTitle()); 
        
        //getCurrentUrl 
        System.out.println(driver.getCurrentUrl());
        //getPageSoureseCode
        System.out.println(driver.getPageSource()); 
        //getWindowHandle() - returns ID of the single browser window
         // String wid=driver.getWindowHandle(); 
          
          System.out.println("window ID :+windowid"); 
        
        //getWindowHandles() - returns ID of the multiple browser windows
         driver.findElement(By.linkText("OrangeHRM,Inc")).click(); //this new browser window
         
        
        

		
		
	}

}
