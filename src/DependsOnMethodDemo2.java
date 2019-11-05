import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodDemo2 {

	WebDriver driver;
	
	@Test
	public void LoginFunc() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(dependsOnMethods="LoginFunc")
	public void Refresh() {
		driver.navigate().refresh();
	}
	
	@Test(dependsOnMethods="Refresh")
	public void LogoutFunc() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	}
	
	/*@BeforeMethod
	public void runprerequisite() {
		
	}
	
	@AfterMethod
	public void afterexecution() {
		driver.quit();
	}*/
	
	@BeforeClass
	public void bClass() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	/*@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}*/
	
/*	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}*/
	
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
