package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	
	public static String name;
	public static String email;
	public static String subject;
	public static String message;
	
	public static String browser="chrome";
	
	// Applying to job data needed
	
	public static String Name;
	public static String Email;
	public static String Mob;
	public static String CV;
	
@BeforeSuite
	public static void StartDriver()
	{	
	
	if(browser == "chrome")
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
	}
	else if(browser =="firefox")
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);
	}
		driver.manage().window().maximize();
		driver.navigate().to("https://musala.com/");	
		
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	
	@AfterSuite
	public void StopDriver() {
		
		driver.quit();
	}
	
}
