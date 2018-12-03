package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class withoutusingquit {

	 static
		{
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		}
 public static void main(String[] args) throws InterruptedException
	{

	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  Set<String> windhand=driver.getWindowHandles();
	  for(String link:windhand)
	  {
		 driver.switchTo().window(link);
		 driver.close();
		 Thread.sleep(1000);
	  }
	}
}
