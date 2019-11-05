import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionDemo1 {

	WebDriver driver;
	
	@Test
	public void brunBrowser() {
		driver.get("https://www.fb.com");
	}
	
	@Parameters("browser")
	@Test
	public void abTest(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.out.println("chrome");
			String chromedriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("firefox");
			String firefoxdriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
	}
	
	@Test
	public void chkLogin() throws InterruptedException {
		
		System.out.println("HI");
		/*int count = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList ')]//child::li/a")).size();*/
		/*for(int i=1;i<=count;i++) {
			String linkText = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList ')]//child::li/a")).get(i).getAttribute("href");
			driver.navigate().to(linkText);
			Thread.sleep(2000); 
			driver.navigate().back();
		}*/
	}
	
//	@AfterTest
//	public void aTest() {
//		driver.quit();
//	}
}
