package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class filedownload {

	public static void main(String[] args) throws InterruptedException
	{
	 FirefoxProfile profile=new FirefoxProfile();
	 String key="browser.helperApps.neverAsk.saveToDisk";
	 String value="application/zip";
	 profile.setPreference(key, value);
	 FirefoxOptions option=new FirefoxOptions();
	 option.setProfile(profile);
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.seleniumhq.org/download/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	 Thread.sleep(1000);
	 driver.close();

	}

}
