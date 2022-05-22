package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Career extends PageBase{

	public Career(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//ul[@id='menu-main-nav-1']//a[@class='main-link'][normalize-space()='Careers']")
	WebElement Career;
	
	@FindBy(xpath="//span[@data-alt='Check our open positions']")
	WebElement OpenPos;
	
	public String URL;
	public String attribute;
	
	@FindBy(xpath="//select[@id='get_location']")
	WebElement Location;
	
	
//	@FindBy(xpath="//h2[normalize-space()='Automation QA Engineer']")
	@FindBy(xpath="//*[@id=\"content\"]/section/div[2]/article[2]/div/a")
	WebElement AutoPos;
	
	@FindBy(xpath="//h2[normalize-space()='General description']")
	public
	WebElement General;
	
	@FindBy(xpath="//h2[normalize-space()='Requirements']")
	public
	WebElement Reqs;
	
	@FindBy(xpath="//h2[normalize-space()='Responsibilities']")
	public
	WebElement Res;
	
	@FindBy(xpath="//h2[normalize-space()='What we offer']")
	public
	WebElement Offer;
	
	@FindBy(xpath="//*[@id=\"post-1501\"]/div/div[2]/div[2]/a/input")
	public
	WebElement Apply;
	
	@FindBy(xpath="//input[@id='cf-1']")
	WebElement Name;
	
	@FindBy(xpath="//input[@id='cf-2']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='uploadtextfield']")
	WebElement CV;
	
	@FindBy(xpath="//input[@id='cf-3']")
	WebElement Mob;
	
	@FindBy(xpath="//input[@id='adConsentChx']")
	WebElement agree;
	
	@FindBy(xpath="//input[@value='Send']")
	WebElement Send;
	
	@FindBy(xpath="//button[@class='close-form']")
	WebElement close;
	
	@FindBy(xpath="//span[contains(text(),'The e-mail address entered is invalid.')]")
	public
	WebElement InEmail;
	
	@FindBy(xpath="//span[contains(text(),'The field is required.')]")
	public
	WebElement InName;
	
	@FindBy(xpath="//span[contains(text(),'The telephone number is invalid.')]")
	public
	WebElement InMob;
	
	@FindBy(xpath="//span[contains(text(),'The field is required.')]")
	public
	WebElement Message;

	@FindBy(xpath="//span[contains(text(),'Please verify that you are not a robot.')]")
	public
	WebElement Robot;
	
	@FindBy(xpath="//*[@id=\"fancybox-close\"]")
	WebElement cancel;
	
	
	public void career() {
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		ClickButton(Career);
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		ClickButton(OpenPos);
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		URL=driver.getCurrentUrl();
		

	}
	
	public void AutoPos() {
		
		Select Loc = new Select(Location);
		Loc.selectByVisibleText("Anywhere");
		try {
	        Thread.sleep(10*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		ClickButton(AutoPos);
	}
	
	
	public void Apply() {
		
		try {
	        Thread.sleep(10*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		js.executeScript("window.scrollBy(0,1000)");
		
		ClickButton(Apply);
	}
	
	public void Form(String Name, String Email, String Mob , String CV) {
		SetTextElement(this.Name,Name);
		SetTextElement(this.Email,Email);
		SetTextElement(this.Mob,Mob);
		SetTextElement(this.CV,CV);
		try {
	        Thread.sleep(10*100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		ClickButton(agree);
		ClickButton(Send);
		try {
	        Thread.sleep(10*100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		ClickButton(close);
		
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public void Cancel() {
		
		ClickButton(cancel);
		
	}
}
