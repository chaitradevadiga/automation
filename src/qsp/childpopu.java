package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class childpopu {
	static
	{
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) 
	{
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  String windhand=driver.getWindowHandle();
	  System.out.println(windhand);
	  driver.quit();
	}

}
