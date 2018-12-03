package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitask {

	static 
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[.='TASKS']")).click();
			Thread.sleep(1000);
			String f="(//div[@class='checkbox inactive'])[2]";
			driver.findElement(By.xpath(f)).click();
			Thread.sleep(10000);
			String xp="//span[.='Delete']";
			driver.findElement(By.xpath(xp)).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[@id='deleteTaskPopup_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
			String f1="(//div[@class='checkbox inactive'])[4]";
			driver.findElement(By.xpath(f1)).click();
			Thread.sleep(10000);
			String xp1="//span[.='Delete']";
			driver.findElement(By.xpath(xp1)).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_cancelBtn']")).click();
			Thread.sleep(10000);
			
			driver.close();
			
			

		}

	}


