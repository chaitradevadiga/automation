package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableeven {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  FirefoxDriver driver = new FirefoxDriver();
		  Thread.sleep(1000);
		  driver.get("file:///C:/Users/chaitra/Desktop/sampp1/tables.html");
		  List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		  Thread.sleep(1000);
		  int count=checkbox.size();
		  System.out.println("count:"+count);
		  Thread.sleep(1000);
		  for(int i=1; i<count; i=i+2)
		  {
			  WebElement link=checkbox.get(i);
			  link.click();
			  
		  }

	}

}
