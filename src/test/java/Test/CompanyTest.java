package Test;
import org.testng.annotations.Test;
import Pages.Company;

import org.testng.Assert;


public class CompanyTest extends TestBase {
	
	Company Co;
	
	@Test(priority =3 , alwaysRun=true)
	
	public void leadersection() {
		
		Co = new Company(driver);
		
		Co.CompanyURL();
		try {
	        Thread.sleep(10*500);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		Assert.assertEquals(Co.URL,"https://www.musala.com/company/");
		
		  try {
		        Thread.sleep(10*100);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		  
		  boolean l = Co.Leadership.isDisplayed();
		  
		  Assert.assertTrue(l);
		
		Co.FB();
		
		  try {
		        Thread.sleep(10*500);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		 Assert.assertEquals(Co.URL2,"https://www.facebook.com/MusalaSoft?fref=ts");
		  
		Boolean b=Co.MusalaPic.isDisplayed();
		
		Assert.assertTrue(b);
		
		Co.ReSession();
		
		 try {
		        Thread.sleep(10*500);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		//driver.close();
		
		
		
	}
}