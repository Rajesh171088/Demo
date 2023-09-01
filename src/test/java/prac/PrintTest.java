package prac;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTest {
	@Parameters("browser")
	@Test
	public void trialTest(String browser) throws InterruptedException
	{
		System.getProperty("browser","chrome");
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		String url="https://mail.google.com/mail/u/0/#inbox";
		driver.get(url);
		Thread.sleep(2000);
		System.out.println(url);
		System.out.println(driver);
		driver.quit();		
	}

}
