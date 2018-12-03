package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javapops
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		f1.findElement(By.id("loginbutton")).click();
		Alert a1=f1.switchTo().alert();
		Thread.sleep(1000);
		String text=a1.getText();
		System.out.println(text);
		a1.accept();

	}

}
