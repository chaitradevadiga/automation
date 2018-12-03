package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class solution {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://home.redbrickhealth.com/");
	    WebElement ka=driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
	    Actions act= new Actions(driver);
	    act.moveToElement(ka).perform();
	    Thread.sleep(10000);
	    String xp="//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']";
	    List<WebElement> ha=driver.findElements(By.xpath(xp));
	    int count=ha.size();
	    System.out.println("count:"+count);
	    Thread.sleep(10000);
	    for(WebElement link:ha)
	    {
	    	String put=link.getText();
	    	System.out.println(put);
	 
	    }

	}

}
