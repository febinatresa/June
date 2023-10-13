package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.close();
		String actualTitle=driver.getTitle();
		String expTitle="Google";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
