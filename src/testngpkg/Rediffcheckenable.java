package testngpkg;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediffcheckenable {
	ChromeDriver driver=new ChromeDriver();
	@BeforeMethod
	public void setup()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value ='m']"));
		if(radiobutton.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not slected");
		}
		
	}
	@Test
	public void test2()
	{
		WebElement createb=driver.findElement(By.xpath("//input[@id='Register']"));
		if(createb.isEnabled())
		{
			System.out.println("sucess");
	}
		else
		{
			System.out.println("not enabld");
		}
		
	}
@Test
public void test3()
{
	
}
	
	
	
	//*[@id='gh']/table/tbody/tr/td[1]/h1/a
}
