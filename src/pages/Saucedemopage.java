package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemopage {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtocart_backpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement addtocart_bikelight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addtocart_bolt_t_shirt;
	
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement addtocart_fleece_jacket;
	
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement addtocart_onesie;

	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement addtocart_tshirt_red;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement shopping_cart_container;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	
	@FindBy(id="first-name")
	WebElement first_name;
	
	@FindBy(id="last-name")
	WebElement last_name;
	
	
	@FindBy(id="postal-code")
	WebElement postal_code;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="finish")
	WebElement finishbutton;
	//*[@id="checkout"]
	////*[@id="shopping_cart_container"]/a/span
	
	@FindBy(id="back-to-products")
	WebElement back_to_products_button;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement burgermenu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logoutsidebar;
	
	
	
	
	
	public Saucedemopage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setValues(String usrnm,String pswd)
	{
		username.sendKeys(usrnm);
		password.sendKeys(pswd);	

	}
	public void loginbuttonclick()
	{
		loginbutton.click();
	}
	public void clearFields()
	{
		//driver.navigate().back();	
		username.clear();
		password.clear();
		driver.navigate().refresh();
	}
	public void addtocart()
	{
		addtocart_backpack.click();
		addtocart_bikelight.click();
		addtocart_bolt_t_shirt.click();
		addtocart_fleece_jacket.click();
		addtocart_onesie.click();
		addtocart_tshirt_red.click();
		shopping_cart_container.click();
		
		checkout.click();
	}
	public void checkout()
	{
		first_name.sendKeys("febina");
		last_name.sendKeys("antony");
		postal_code.sendKeys("688007");
		continuebutton.click();
		finishbutton.click();
		
		
	}
	public void backhome()
	{
	back_to_products_button.click();

	}
	public void logout() throws InterruptedException
	{
		burgermenu.click();
		Thread.sleep(3000);

		logoutsidebar.click();
		
	}
}



