import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//Setting Chrome Browser Path
		String chromedriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		//System.out.println(chromedriverpath);
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//Launch the application
		driver.get("https://www.fb.com");
		//Getting Title
		/*String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);*/
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*driver.navigate().back();
		driver.navigate().to("https://www.google.com");*/
		driver.close();
		//driver.navigate().forward();
		
		/*
		//Setting Fireox Browser Path
		String firefoxdriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\geckodriver.exe";
		//System.out.println(firefoxdriverpath);
		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
		//Launch the firefox browser
		driver = new FirefoxDriver();*/
		
				
		/*//Setting internet explorerBrowser Path
		String iedriverpath = System.getProperty("user.dir")+"\\BrowserDrivers\\iedriverserver.exe";
		//System.out.println(iedriverpath);
		System.setProperty("webdriver.ie.driver", iedriverpath);
		
		//Launch the internet explorer browser
		WebDriver driver = new InternetExplorerDriver();*/
	}
}
