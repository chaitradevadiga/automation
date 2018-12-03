package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userinput {

	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser");
		String browser=sc.nextLine();
		
		WebDriver driver=null;
		
		if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		     driver=new FirefoxDriver();
		}
		
		else if(browser.equals("gg"))
		{
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
          System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		
		Thread.sleep(1000);
		driver.close();
		
	

	}

}
