package qsp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pommulti {

	
		//declaration
		@FindBy(xpath="//a")
		private List<WebElement> alllinks;
		
		
		//intialization
		public  pommulti(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		public void 
		getlinks()
		{
		 int count=alllinks.size();
		 System.out.println(count);
		 for(WebElement link:alllinks)
		 {
			String text=link.getText(); 
			System.out.println(text);
		 }
	    }

}
