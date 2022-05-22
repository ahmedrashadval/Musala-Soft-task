package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CareersList extends PageBase {

	public CareersList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//ul[@id='menu-main-nav-1']//a[@class='main-link'][normalize-space()='Careers']")
	WebElement Career;
	
	@FindBy(xpath="//span[@data-alt='Check our open positions']")
	WebElement OpenPos;
	public String Text;
	public String URL;
	
	@FindBy(xpath="//select[@id='get_location']")
	WebElement Location;
	
	@FindBy(xpath="//*[@id=\"content\"]/section/div[2]/article")
	List<WebElement> jobs;

	
	
	
	
	
	
	
	
	public void SofiaPos() {
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
		Select Loc = new Select(Location);
		Loc.selectByVisibleText("Sofia");
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		for(WebElement job:jobs)
		{
				Text = job.getText();
				URL=job.getAttribute("a");
				String lines[]=Text.split("\\r?\\n");
				System.out.println("Job:"+lines[0]);
				System.out.println("More Info: "+ URL);
				
			}
		
}
	public void SkopjePos() {
		Select Loc = new Select(Location);
		Loc.selectByVisibleText("Skopje");
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		for(WebElement job:jobs)
		{
				Text = job.getText();
				URL=job.getAttribute("a");
				String lines[]=Text.split("\\r?\\n");
				System.out.println("Job:"+lines[0]);
				System.out.println("More Info: "+ URL);
				
			}
		
	}

}
