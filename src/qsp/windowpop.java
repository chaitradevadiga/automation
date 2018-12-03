package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowpop {
	
	static
	{
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("//a[.='3.141.59']")).click();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_LEFT);
        r.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(10000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.close();
        
	}

}
