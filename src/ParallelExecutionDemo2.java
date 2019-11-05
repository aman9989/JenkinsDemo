import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExecutionDemo2 {

	WebDriver driver;
	
	@Test
	public void runBrowser() {
		driver.get("https://www.facebook.com");
	}
	
	@BeforeSuite
	public void bSuite() {
		//Setting Chrome Browser Path
		String chromedriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		//System.out.println(chromedriverpath);
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		//Launch the chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void aSuite() {
		driver.quit();
	}
}
