package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class niha {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     driver.findElement(By.name("q")).sendKeys("qspiders");
	     Thread.sleep(10000);
	     List<WebElement> allsugestion=driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
	     int count=allsugestion.size();
	     System.out.println("count:"+count);
	     for(int i=0; i<count; i++)
	     {
	    	 WebElement link=allsugestion.get(i);
	    	 String text=link.getText();
	    	 System.out.println(text);
	     }
	     //driver.close();
	     
	     

	}

}
