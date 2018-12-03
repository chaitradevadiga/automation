package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook111 {

	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the email/phone no");
		String un=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the email/phone no");
		String pw=sc1.nextLine();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver f1=new ChromeDriver();
		f1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		f1.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(10000);
		f1.findElement(By.id("pass")).sendKeys(pw);
		f1.findElement(By.cssSelector("input[type='submit']")).submit();
		// TODO Auto-generated method stub

	}

}
