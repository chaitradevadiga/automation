package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("file:///C:/Users/chaitra/Desktop/sampp1/form.html");
		Thread.sleep(1000);
		//1
		f1.findElement(By.xpath("//a[.='facebook']")).click();
		f1.navigate().back();
		//2
		f1.findElement(By.id("s")).submit();
		Thread.sleep(10000);
		f1.navigate().back();
		Thread.sleep(1000);
		WebElement fname=f1.findElement(By.id("fn"));
		Thread.sleep(1000);
		//3
		fname.sendKeys("chaitra");
		Thread.sleep(1000);
		//4
		fname.clear();
		WebElement fb=f1.findElement(By.xpath("//a[.='facebook']"));
		//5
		
		String text=fb.getText();
		System.out.println("text:"+text);
		//6
		
		String tagname=fb.getTagName();
		System.out.println("tagname:"+tagname);
		//7
		String color=fb.getCssValue("color");
		System.out.println("color:"+color);
		//8
		Dimension size=fb.getSize();
		System.out.println("size:"+size);
		int h=size.getHeight();
		int w=size.getWidth();
		System.out.println("h:"+h);
		System.out.println("w:"+w);
		Point loc=fb.getLocation();
		
		
		
		// TODO Auto-generated method stub

	};

}
