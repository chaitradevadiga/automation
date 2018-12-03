package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closechild 
{

	 static
		{
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		}
public static void main(String[]args) throws InterruptedException
	 {
	WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  String pwh=driver.getWindowHandle();
	  Set<String>  allwh=driver.getWindowHandles();
	  allwh.remove(pwh);
	  for(String link:allwh)
	  {
		  driver.switchTo().window(link);
		  Thread.sleep(1000);
		  driver.close();
	  }
	  
 }
}
