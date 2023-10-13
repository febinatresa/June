package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerbooking {

	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("https://www.booking.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		while(true)
		{
			
			WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
			String monthtext=month.getText();
			if(monthtext.equals("November 2023"))
			{
				month.click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
		}
		List<WebElement> alldate=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		for(WebElement dateelement:alldate)
		{
			String date=dateelement.getText();
			if(date.equals("20"))
			{
				dateelement.click();
				break;
			}
		}
	}
	
	
	
	//*[@id="indexsearch"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]

}
