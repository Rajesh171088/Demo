package prac;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTest {
	
	@Test
	public void trialTest() throws InterruptedException
	{
		String browser="chrome";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://mail.google.com/mail/u/0/#inbox";
		driver.get(url);
		Thread.sleep(2000);
		System.out.println(url);
		System.out.println(driver);
		driver.quit();		
	}

}
