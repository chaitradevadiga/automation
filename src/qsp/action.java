package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class action {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("file:///C:/Users/chaitra/Desktop/sampp1/select.html");
	    WebElement hotel=driver.findElement(By.id("mangalore launch"));
	    Select sel=new Select(hotel);
	    Thread.sleep(10000);
	    sel.selectByIndex(1);
	    Thread.sleep(10000);
	    sel.selectByValue("p");
	    Thread.sleep(10000);
	    sel.selectByVisibleText("fish");
	    Thread.sleep(10000);
	    sel.deselectByIndex(1);
	    Thread.sleep(10000);
	    sel.deselectByValue("p");
	    Thread.sleep(10000);
	    sel.deselectByVisibleText("fish");
	    Thread.sleep(10000);
	    //sel.deselectAll();
	    //Thread.sleep(10000);
	    
	    
	}

}
