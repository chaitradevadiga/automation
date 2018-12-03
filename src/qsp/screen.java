package qsp;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class screen {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.manage().window().maximize();
		f1.get("https://demo.actitime.com/login.do");
		TakesScreenshot t=(TakesScreenshot)f1;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dst=new File("./Screenshot.png");
		FileUtils.copyFile(src, dst);
		Thread.sleep(1000);
		f1.close();

	}

}
