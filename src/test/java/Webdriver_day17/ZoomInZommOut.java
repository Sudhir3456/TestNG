package Webdriver_day17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZommOut {

	public static void main(String[] args) throws InterruptedException {


	    WebDriver driver=new ChromeDriver();	
		driver.get("https://www.nopcommerce.com/en/demo");	
		//Thread.sleep(5000);
	//	driver.manage().window().maximize();
	//	Thread.sleep(5000);
		driver.manage().window().maximize();
        Thread.sleep(5000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='80%'"); //set zoom level 50%
        Thread.sleep(5000);


		
	}

}
