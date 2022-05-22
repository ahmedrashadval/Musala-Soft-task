package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;


public class Company extends PageBase {

	public Company(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//ul[@id='menu-main-nav-1']//a[@class='main-link'][normalize-space()='Company']")
	WebElement Company;
	public
	String URL;
	public String URL2;
	
	@FindBy(xpath="//*[@id=\"menu-btn\"]")
	WebElement menu;
	
	@FindBy(xpath="//section[@class='company-members']")
	public
	WebElement Leadership;
	
	@FindBy(id="wt-cli-accept-all-btn")
	WebElement cookies;
	
	@FindBy(xpath="//a[@aria-label='Musala Soft profile photo']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")
	public
	WebElement Image;
	
	
	@FindBy(xpath="/html[1]/body[1]/footer[1]/div[1]/div[1]/a[4]")
	WebElement FaceBook;
	
	
	@FindBy(xpath="//img[@alt='May be an image of text that says \"MusalaSoft\"']")
	public
	WebElement MusalaPic;
	public void CompanyURL() {
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		ClickButton(Company);
		
		URL=driver.getCurrentUrl();
		ClickButton(cookies);
	}
	
	public void FB() {
		
		try {
	        Thread.sleep(10*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		ClickButton(FaceBook);
		
		String parentID = driver.getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		if(parentID.equals(tabs2.get(0))) {
		  driver.switchTo().window(tabs2.get(1));
		}else {
		  driver.switchTo().window(tabs2.get(0));
		}
		
		URL2=driver.getCurrentUrl();
		
		ClickButton(Image);
		try {
	        Thread.sleep(10*100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	
		
	}
	
	public void ReSession() {
		String parentID = driver.getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		if(parentID.equals(tabs2.get(0))) {
		  driver.switchTo().window(tabs2.get(1));
		}else {
		  driver.switchTo().window(tabs2.get(0));
		}
		
		
	}
	
	
	
	
}