package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniuma {

	public static void main(String[] args)
	{
		
			
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				FirefoxDriver f1=new FirefoxDriver();
				f1.get("https://www.seleniumhq.org/download/");
				f1.findElement(By.xpath("(//a[.='latest'])[2]")).click();
				
				
				// TODO Auto-generated method stub

			}

		
// TODO Auto-generated method stub

	}


