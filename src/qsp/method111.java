package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class method111 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		//1
		f1.manage().window().maximize();
		//2
		f1.get("https://www.google.com");
		//3
		String title=f1.getTitle();
		System.out.println("title:"+title);
		//4
		String url=f1.getCurrentUrl();
		System.out.println("url:"+url);
		//5
		String src=f1.getPageSource();
		//System.out.println("source:"+src);
		Thread.sleep(1000);
		//6
        f1.navigate().to("https://www.naukri.com/");
        //7
        f1.navigate().back();

        f1.navigate().back();
        f1.navigate().forward();
        f1.quit();
        
		
		 
		

	}

}
