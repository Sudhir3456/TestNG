package TestNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		System.out.println("Chrome is lunched.....");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String ped) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email); // "pavanol123@gmail.com"
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(ped);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

		if (status == true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}
 
	@AfterClass
	void tearDewn() {
		System.out.println("this is after Class method...");
		//driver.close();
		driver.close();

	}

	@DataProvider(name = "dp", indices = {2,4})
	Object[][] loginData() {
		Object data[][] = { { "abc@gmail.com", "test123" }, 
				            { "xyz@gmail.com", "test0123" },
				            { "pavanol123@gmail.com", "test@123" }, 
				            { "sudhir@gmail.com", "test19923" },
				            { "johan@gmail.com", "test12983" },

		};

		return data;

	}

}
