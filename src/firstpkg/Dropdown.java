package firstpkg;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();

		}
		@Test
		public void test1() 
		{
			String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
			driver.get(baseurl);
			Select day=new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]")));
			day.selectByVisibleText("01");
			Select month=new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]")));
			month.selectByVisibleText("MAR");
		}
		

}
