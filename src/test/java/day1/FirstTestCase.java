package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class FirstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		   driver.get("https://www.linkedin.com/feed/");
		   
		String wId =driver.getWindowHandle();
		   
		String title=driver.switchTo().window(wId).getTitle();
		if(title.contains("Linkedin"))
		{
			int hight=driver.manage().window().getSize().getHeight();
			System.out.print("first application window hide"+hight);

		}
		
		System.out.print("first application window hide");

		
		driver.close();
 	}

}
