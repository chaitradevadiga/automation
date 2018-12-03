package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explict {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    String etitle="actiTIME - Enter Time-Track";
	    WebDriverWait wait=new WebDriverWait(driver,15);
	    try
	    {
	    	wait.until(ExpectedConditions.titleIs(etitle));
	    	System.out.println("passs.........");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("fail...............");
	    }
	   Thread.sleep(1000); 
	  driver.close();  

	}

}
