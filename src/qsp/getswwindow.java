package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getswwindow {
  static
		{
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		}
    public static void main(String[] args)
	{

  	  WebDriver driver=new FirefoxDriver();
  	  driver.manage().window().maximize();
  	  driver.get("https://www.naukri.com/");
  	  Set<String> windhand=driver.getWindowHandles();
  	  for(String link:windhand)
  	  {
  		 System.out.println(link);  
  	  }
  	 // System.out.println(windhand);
  	  driver.quit();
    	
    	
    	
	}

}
