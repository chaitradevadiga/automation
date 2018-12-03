package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class managewindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		Dimension d=new Dimension(300,200);
		f1.manage().window().setSize(d);

	    Dimension size=f1.manage().window().getSize();
	    System.out.println("size:"+size);
	    Point p=f1.manage().window().getPosition();
	    System.out.println("p:"+p);

		
		// TODO Auto-generated method stub

	}

}
