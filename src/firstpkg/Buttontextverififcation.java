package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontextverififcation {
		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();

		}
		@Test
		public void test1() 
		{
			String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
			driver.get(baseurl);
			WebElement button=driver.findElement(By.xpath("//input[@class='btn_checkavail']"));
			
			  if(button.getAttribute("value").equals("Check availability"))
			    {
			        System.out.println("Test Pass");
			        //return true;
			    }
			    else{
			       System.out.println("Test Failed");
			        //return false;
			    } 
			
		}

}
