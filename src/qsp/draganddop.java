package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddop {

	public static void main(String[] args) throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement src = f1.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=f1.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(f1);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(10000);
		f1.close();

	}

}
