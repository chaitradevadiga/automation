package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {
	 static
		{
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		Thread.sleep(10000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\chaitra\\Documents");
		Thread.sleep(10000);
		driver.quit();

		
	}

}
