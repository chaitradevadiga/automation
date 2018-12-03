package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionex {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://home.redbrickhealth.com/");
	    WebElement ka=driver.findElement(By.xpath("//a[.='About Us']"));
	    Actions act= new Actions(driver);
	    act.moveToElement(ka).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='Company']")).click();

	}

}
