package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demojava1 {
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//FirefoxDriver f1=new FirefoxDriver();
	}

	public static void main(String[] args) 
	{
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		f1.get("https:www.seleniumhq.org/download/");
		pommulti pom=new pommulti(f1);
		pom.getlinks();
	

	}

}
