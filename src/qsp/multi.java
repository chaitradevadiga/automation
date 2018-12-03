package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multi {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("file:///C:/Users/chaitra/Desktop/sampp1/select.html");
	    WebElement hotel= driver.findElement(By.id("mangalore launch"));
	    Select sel=new Select(hotel);
	    List<WebElement> opt=sel.getOptions();
	    int count=opt.size();
	    System.out.println(count);
	    for(WebElement link:opt)
	    {
	    	String s1=link.getText();
	    	System.out.println(s1);
	    }
	    
	    
	    

	}

}
