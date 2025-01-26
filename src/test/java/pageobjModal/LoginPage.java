package pageobjModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

     WebDriver driver;
     
     //constructor
     LoginPage(WebDriver driver)
     {
    	 this.driver=driver;
    	 
     }
	 //locators
     By tex_username_loc=By.xpath("//input[@placeholder='Username']");
     By tex_password_loc=By.xpath("//input[@placeholder='Password']");
     By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
     
     //Action methods
     
     public void setUserName(String user)
     {
    	 driver.findElement(tex_username_loc).sendKeys(user);
    	 
     }

     public void setPassword(String pwd)
     {
    	 driver.findElement(tex_password_loc).sendKeys(pwd);
    	 
     }
     public void clickLogin()
     {
    	 driver.findElement(btn_login_loc).click();
    	 
     }
     

	
	
	
	
}
