package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://jqueryui.com/droppable/");
		f1.switchTo().frame(0);
		WebElement src = f1.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=f1.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(f1);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(10000);
		f1.close();

	}

}
