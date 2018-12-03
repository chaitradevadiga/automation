package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class encapacti 
{
	//declaration
	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement psw;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement log;
	
	//intialization
	public  encapacti(WebDriver driver)
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
	

}
