package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomface
{
	//declaration
		@FindBy(id="email")
		private WebElement untb;
		@FindBy(id="pass")
		private WebElement psw;
		@FindBy(xpath="//input[@value='Log In']")
		private WebElement log;
		public  pomface(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		public void enterusername(String un)
		{
			untb.sendKeys(un);
		}
		
		public void enterpass(String pwd)
		{
			psw.sendKeys(pwd);
		}
		public void clik()
		{
			log.click();
		}
		
   //

}
