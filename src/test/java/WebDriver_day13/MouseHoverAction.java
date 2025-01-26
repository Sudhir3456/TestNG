package WebDriver_day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		
        Actions act=new Actions(driver);
        //MouseHoverAction
     //   act.moveToElement(desktop).moveToElement(mac).click().build().perform();
        act.moveToElement(desktop).moveToElement(mac).click().build();
 
       
        
        //Right click action
      //  act.contextClick(desktop).perform();
        
  	
		

	}

}
