package testbase____examp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectExamp.AccountRegistrationPage;
import pageObjectExamp.HomePage;

public class Tcoo1_AccountRegistrationTest {

	public WebDriver driver;

	@BeforeClass
	void setUP() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	void tearDown() {
		driver.quit();

	}

	@Test
	public void verify_account_registration() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();

		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		// regpage.setFirsttName(randomeString().toUpperCase());
		// regpage.setLatName(randomeString().toUpperCase());
		regpage.setFirsttName("ggdfgjdjj");
		regpage.setLatName("dfdjgxfgtdtrd");
		regpage.setEmail("syhhhgg@0108@.com");
		regpage.setPassword("y768754575");
		regpage.chechekPolicy();
		regpage.clickContinue();

		// regpage.setFirsttName(randomeString().);
		String Configmsg = regpage.setConfirmationMsg();

		Assert.assertEquals(Configmsg, "Your Account Has Been Created!");

	}

}
