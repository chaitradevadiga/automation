package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class comp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("https://demo.actitime.com/login.do");
		WebElement ac = f1.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act=new Actions(f1);
		Thread.sleep(10000);
		act.sendKeys(Keys.CONTROL).click(ac).perform();

	}

}
