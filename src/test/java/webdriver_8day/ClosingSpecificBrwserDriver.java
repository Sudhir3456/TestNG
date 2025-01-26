package webdriver_8day;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrwserDriver {

	public static void main(String[] args)   {
 
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Apporach!
		
	/*List<String> windowList=new ArrayList<String>(windowIDs);
		
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//Switch to the child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//Switch to parent window 

		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle()); */
		
		//Apporach2
		
		for(String winID:windowIDs)
		{
			
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(driver.getTitle()); 

			
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				System.out.println(driver.getTitle()); 
				driver.close();


			}
		}
		
		//driver.close();
		
		
	}

}
