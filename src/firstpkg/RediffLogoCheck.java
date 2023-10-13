package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogoCheck {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	//List<WebElement> linksdetails=driver.findElements(By.tagName("img"));
	Boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	if(logo)
	{
		System.out.println("sucess");
	}
	else
	{
		System.out.println("not");
	}

	}
}
