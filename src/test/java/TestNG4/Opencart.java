package TestNG4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(TestNG3.MyListener.class)
public class Opencart {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OpenCard");

	}

	@Test(priority = 3)
	void testUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.opencart.com/en-gb?route=account/login");

	}

	@AfterClass
	void tearDown() {

		driver.quit();
	}

}
