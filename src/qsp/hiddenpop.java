package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://www.cleartrip.com/");
		f1.findElement(By.id("DepartDate")).click();
		String xp="//span[.='November']/../../..//a[.='28']";
		f1.findElement(By.xpath(xp)).click();
		

	}

}
