package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		f1.findElement(By.cssSelector("input[type='email']")).sendKeys("chaitra.sherigar@gmail.com");
		Thread.sleep(1000);
		f1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
		f1.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
		Thread.sleep(1000);
		f1.findElement(By.xpath("//span[.='Next']")).click();
	
		// TODO Auto-generated method stub
	}

}
