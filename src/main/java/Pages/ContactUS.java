package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class ContactUS extends PageBase {

	public ContactUS(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html/body/main/section[2]/div/div/div/a[1]/button")
	WebElement contactus;
	
	
  @FindBy(name="your-name")
  WebElement name;
  
  @FindBy(name="your-email")
  WebElement email;
  
  @FindBy(name="your-subject")
  WebElement subject;
  
  @FindBy(name="your-message")
  WebElement message;
  
  @FindBy(xpath="//*[@id=\"wpcf7-f875-o1\"]/form/div[2]/p/input")
  WebElement send;
  
  @FindBy(xpath="//*[@id=\"wpcf7-f875-o1\"]/form/p[2]/span/span")
  public
  WebElement errmsg;
  
  @FindBy(id="fancybox-close")
  public
  WebElement Close;
  
  public void contactBTN(String name,String email,String subject, String message) {
	  
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contactus);
	  ClickButton(contactus);
	  SetTextElement(this.name,name);
	  SetTextElement(this.email,email);
	  SetTextElement(this.subject,subject);
	  SetTextElement(this.message,message);
	  try {
	        Thread.sleep(10*100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	  ClickButton(send);  
	  
	  try {
	        Thread.sleep(10*100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
  }
  
  public void Close() {
	  
	  ClickButton(Close);
  }
}
