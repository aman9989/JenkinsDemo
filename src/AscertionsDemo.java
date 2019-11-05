import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AscertionsDemo {

	WebDriver driver;
	
	@Test(priority=1)
	public void URL() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=2) //(dependsOnMethods="URL") //Verified with Hard Ascertion
	public void verifyTitle() {
		String actualTitle = "OrangeHRM Title";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("End execution of Hard Assert");
	}
	
	@Test(priority=3) //(dependsOnMethods="verifyTitle") //Verified with Soft Ascertion
	public void verifyTitle2() {
		SoftAssert sa= new SoftAssert();
		String actualTitle = "OrangeHRM Title";
		String expectedTitle = driver.getTitle();
		sa.assertEquals(actualTitle, expectedTitle);
		System.out.println("End execution of Soft Assert");
		sa.assertAll(); //To display the actual results
	}
	
	@BeforeSuite
	public void launBrowser() {
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
	public void exitBrowser() {
		driver.quit();
	}
}
