package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();

		}
		@Test
		public void test()
		{
			driver.get("https://www.facebook.com");
			List<WebElement> linksdetails=driver.findElements(By.tagName("a"));
				System.out.println("no of links"+linksdetails.size());
				for(WebElement link:linksdetails){
					 System.out.println(link.getText() + " - " + link.getAttribute("href"));
					 }
		}
		

}
