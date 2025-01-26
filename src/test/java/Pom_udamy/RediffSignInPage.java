package Pom_udamy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSignInPage {
	
	WebDriver driver;
	By UserName=By.xpath("//input[@id='login1']");
	By Password=By.xpath("//input[@id='password']");
	By SignInButton=By.xpath("//input[@title='Sign in']");
	
	public RediffSignInPage(WebDriver driver)
	{
		 this.driver=driver;
	}
    public WebElement userName()
    {
    	
    	return driver.findElement(UserName);
    }
    public WebElement password()
    {
    	return driver.findElement(Password);
    }
    public WebElement SignInButton()
    {
	   return driver.findElement(SignInButton);
    }
	
	

}
