package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateelemntFb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dsf");
		driver.findElement(By.name("login")).click();
	}

}
