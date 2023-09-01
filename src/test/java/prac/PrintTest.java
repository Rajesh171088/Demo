package prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintTest {
	
	@Test
	public void trialTest() throws InterruptedException
	{
		String browser="chrome";
		WebDriver driver=new ChromeDriver();
		String url="https://mail.google.com/mail/u/0/#inbox";
		driver.get(url);
		Thread.sleep(2000);
		driver.quit();		
	}

}
