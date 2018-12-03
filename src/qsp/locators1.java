
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.get("file:///C:/Users/chaitra/Desktop/sampp1/samle.html");
		f1.findElement(By.id("forgot")).click();
		f1.navigate().back();
		f1.findElement(By.name("pass")).click();
		f1.navigate().back();
		f1.findElement(By.className("word")).click();
		f1.navigate().back();
		f1.findElement(By.linkText("forgotten password??")).click();
		f1.navigate().back();
		f1.findElement(By.partialLinkText("inbox")).click();
		
		
		// TODO Auto-generated method stub

	}

}
