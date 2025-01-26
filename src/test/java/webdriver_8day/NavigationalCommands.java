package webdriver_8day;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException     {
 
		
		WebDriver driver=new ChromeDriver();
		
 		
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //accept url only in the string format
	//	driver.manage().window().maximize();
		
       // driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //accept the url obj and string formot
		
		
		@SuppressWarnings("deprecation")
		URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		
		driver.navigate().to(myurl);
		driver.close();
		
		
	}

}
