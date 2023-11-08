package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
	WebDriver driver;
	String user;
	String pass; 
	
	public void enterUrl(String Url)
	{
		driver.get(Url);
	}
	public void enterUsername(String username)
	{
		user=username;
	}
	public void enterPassword(String password)
	{
		pass=password;
	}
	public void login(String url)
	{
		driver.get("https://"+user+":"+pass+"@"+url);
	}
	public void verifyTitle(String title)
	{
		System.out.println(title+" ");
		
		Assert.assertEquals(title,driver.getTitle());
		/** Getting failed because the & is written in the form of &amp character */
      //Assert.assertTrue(driver.getPageSource().contains(title)); 
		
	}
	public Login(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
}
