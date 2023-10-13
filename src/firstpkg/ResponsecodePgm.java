package firstpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponsecodePgm {
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
		try {
			URL u=new URL(baseUrl);
		
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("success-----"+baseUrl);
			}
			else
			{
				System.out.println("not 200");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
