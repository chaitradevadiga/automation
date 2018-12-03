package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actihiddenpop {

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
		driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
		String xp="//a[.='About your actiTIME']";
		driver.findElement(By.xpath(xp)).click();
		WebElement dp=driver.findElement(By.xpath("//span[.='(build 40469)']"));
		String text=dp.getText();
		System.out.println(text);
		driver.quit(); 
		
		

	}
}
