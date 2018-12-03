package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubbb {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver f1=new ChromeDriver();
		f1.manage().window().maximize();
		f1.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		WebElement dc = f1.findElement(By.xpath("//input[@value='Double Click']"));
		Actions act=new Actions(f1);
		Thread.sleep(1000);
		act.doubleClick(dc).perform();
		Thread.sleep(1000);
		f1.close();
		
		
	}

}
