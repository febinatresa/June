package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbid;
	
	@FindBy(id="pass")
	WebElement fbpswd;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String email,String pswd)
	{
		fbid.sendKeys(email);
		fbpswd.sendKeys(pswd);	
	}
	public void loginclick()
	{
		fbloginbutton.click();
	}


}
