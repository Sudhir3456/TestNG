package Pom_udamy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

	WebDriver driver;
	
	//By Logo=By.xpath("//span[@class='hmsprite logo']");
	 @FindBy(xpath="//span[@class='hmsprite logo']")
     WebElement Logo;
     
	
	
	//By sign=By.xpath("//a[@title='Already a user? Sign in']");
	 @FindBy(xpath="//a[@title='Already a user? Sign in']")
     WebElement sign;

	public RediffHomePage(WebDriver driver)
	{
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
    public WebElement logo()
    {
    	
    	//return driver.findElement(Logo);
    	return Logo;
    }
    public WebElement signIn()
    {
    	//return driver.findElement(sign);
    	return sign;
    }
	
}
