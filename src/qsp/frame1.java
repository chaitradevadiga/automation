package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("file:///C:/Users/chaitra/Desktop/sampp1/page1.html");
		f1.findElement(By.id("Fn")).sendKeys("niha");
		Thread.sleep(1000);
		f1.switchTo().frame(0);
		f1.findElement(By.id("MN")).sendKeys("joncil");
		Thread.sleep(1000);
		f1.switchTo().defaultContent();
		f1.findElement(By.id("ln")).sendKeys("joncil");
		Thread.sleep(1000);
		f1.close();
	}

}
