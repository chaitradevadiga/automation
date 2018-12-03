package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class coll1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("file:///C:/Users/chaitra/Desktop/sampp1/webelement.html");
	     List<WebElement> d1=f1.findElements(By.xpath("//a"));
	     int count=d1.size();
	     for(int i=0;i<count;i++)
	     {
	    	 WebElement t1=d1.get(i);
	    	 String title=t1.getText();
	    	 System.out.println("title:"+title);
	    	 
	     }
	    	 
		
		
	}

}
