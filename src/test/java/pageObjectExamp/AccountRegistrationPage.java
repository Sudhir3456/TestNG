package pageObjectExamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	  // WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
			
	}

	@FindBy(xpath ="//input[@id='input-firstname']" )
	WebElement txtFirstname;
	
	@FindBy(xpath ="//input[@id='input-lastname']" )
	WebElement txtLastname;
	
	@FindBy(xpath ="//input[@id='input-email']" )
	WebElement txtEmail;
	
	@FindBy(xpath ="//input[@id='input-telephone']" )
	WebElement txtTelephone;
	
	@FindBy(xpath ="//input[@id='input-password']" )
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@id='input-confirm']" )
	WebElement txtConfirmPassword;

	@FindBy(xpath ="//input[@name='agree']" )
	WebElement chkdpolicy;

	@FindBy(xpath ="//input[@value='Continue']" )
	WebElement btnContinue;

	@FindBy(xpath ="//h1[normalize-space()='Your Account Has Been Created!']" )
	WebElement msgConfirmation;
	
	public void setFirsttName(String fname)
	{
		txtFirstname.sendKeys(fname);
		
	}
	public void setLatName(String lname)
	{
		txtLastname.sendKeys(lname);
		
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
		
	}
	
	public void setTeliPhone(String phone)
	{
		txtTelephone.sendKeys(phone);
		
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
		
	}
	public void setConfPassword(String confpassword)
	{
		txtConfirmPassword.sendKeys(confpassword);
		
	}
	
	public void chechekPolicy()
	{
		chkdpolicy.click();
		
	}
 /*	public void clickOnSumit()
	{
		btnContinue.click();
		
	}
	*/
	//rest elem
	
	
	
	
	public void clickContinue()
	{   
		//sol1
		//btnContinue.click();
		
		//sol2
		btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
		
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeAsyncScript("arguments[0].click();",btnContinue);
		
		//sol5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//sol6
	//	WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(10));
		// mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		
		
		
		
	}
	
   public  String setConfirmationMsg()
	{
		try {
			return (msgConfirmation.getText());
					
		}
		catch (Exception e) {

               return(e.getMessage());
		
		}
	}  

	
	
	
}
