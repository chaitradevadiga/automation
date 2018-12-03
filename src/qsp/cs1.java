package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class cs1 {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		 // InternetExplorerDriver f1=new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		  f1.get("file:///C:/Users/chaitra/Desktop/sampp1/samle.html");
		  f1.findElementByCssSelector("input[type='text']").sendKeys("chaitra");
		  // TODO Auto-generated method stub

	}

}
