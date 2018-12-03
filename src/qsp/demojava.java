package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demojava {
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//FirefoxDriver f1=new FirefoxDriver();
	}

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		f1.get("https:www.facebook.com");
		pomface lp=new pomface(f1);
		Thread.sleep(10000);
		lp.enterusername("chetu.sherigar@gmail.com");
		lp.enterpass("chetu123");
		lp.clik();
		
		
	

	}

}
