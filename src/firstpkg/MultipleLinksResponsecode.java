package firstpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksResponsecode {
	ChromeDriver driver;
	String baseUrl="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
		driver.get(baseUrl);
		List<WebElement> linksdetails=driver.findElements(By.tagName("a"));
		System.out.println("no of links"+linksdetails.size());
		for(WebElement li:linksdetails){
			 String link=li.getAttribute("href");
			 verify(link);
			 }
	}
	private void verify(String link) {
		try
		{
			URL u=new URL(link);
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("success-----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("404");
			}
			else
			{
				System.out.println("not 200");
			}
		}catch(Exception e)
		{
			e.getMessage();
		}
		}
	

}
