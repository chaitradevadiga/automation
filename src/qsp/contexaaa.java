package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class contexaaa {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("https://demo.actitime.com/login.do");
		WebElement ac = f1.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act=new Actions(f1);
		Thread.sleep(10000);
		act.contextClick(ac).perform();
		Thread.sleep(10000);
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(10000);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		f1.close();
	    

	}

}
