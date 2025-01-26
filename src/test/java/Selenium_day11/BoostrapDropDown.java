package Selenium_day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options
		
		//1) select single option 
	//	driver.findElement(By.xpaoptionsth("//input[@value='Java']")).click();
		
	//	2)capture all the options and find out size
		
		List<WebElement>options =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options : "+options.size());//14
		
		//printing options from dropdown
	/*	for(WebElement op:options)
		
		{
			System.out.println(op.getText());
		}
		
		*/
		
		
	//4) Select the multiple options
		for(WebElement op:options)
		{
			String option=op.getText();
			
			if(option.equals("Java")|| option.equals("Python") || option.equals("MySQL"))
			{
				op.click();
			}
			
		}
		
	}

}
