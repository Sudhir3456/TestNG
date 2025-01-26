package POMbyPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

     WebDriver driver;
     
     //constructor
     LoginPage(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this); //MANDATORY
    	 
     }
	 //locators
     @FindBy(xpath="//input[@placeholder='Username']")
     WebElement tex_username_loc;
     
     @FindBy(xpath="//input[@placeholder='Password']")
     WebElement tex_password_loc;
     
     @FindBy(xpath="//button[normalize-space()='Login']")
     WebElement btn_login_loc;
     
     //Action methods
     
     public void setUserName(String user)
     {
    	 tex_username_loc.sendKeys(user);
    	 
     }

     public void setPassword(String pwd)
     {
    	 tex_password_loc.sendKeys(pwd);
    	 
     }
     public void clickLogin()
     {
    	 btn_login_loc.click();
    	 
     }
      @FindBy(tagName="a")
      List<WebElement> links;

	
	
	
	
}
