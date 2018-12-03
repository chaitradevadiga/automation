package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //Thread.sleep(1000);
		  driver.get("https://www.flipkart.com/");
		  //Thread.sleep(10000);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  //Thread.sleep(10000);
		  driver.findElement(By.name("q")).sendKeys("iphone");
		  //Thread.sleep(10000);
		  List<WebElement> allsuge=driver.findElements(By.xpath("//span[.='iphone']/.."));
		  //Thread.sleep(1000);
		  int count=allsuge.size();
		  System.out.println("count:"+count);
		  //Thread.sleep(10000);
		  for(WebElement link:allsuge)
		  {
			  String text=link.getText();
			  System.out.println(text);
		  }
		  
		  //Thread.sleep(1000);
		  driver.close();

	}

}
