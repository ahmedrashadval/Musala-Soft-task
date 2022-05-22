package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Career;

public class CareerTest extends TestBase {

	Career Cr;
	
	@Test(priority =4 , alwaysRun=true)
	public void Careers() {
		
		Cr = new Career(driver);
		
		Cr.career();
		
		Assert.assertEquals(Cr.URL,"https://www.musala.com/careers/join-us/");
		
		Cr.AutoPos();
		
		boolean general= Cr.General.isDisplayed();
		boolean Reqs = Cr.Reqs.isDisplayed();
		boolean Res = Cr.Res.isDisplayed();
		boolean Offer= Cr.Offer.isDisplayed();
		boolean Apply= Cr.Apply.isDisplayed();
		
		Assert.assertTrue(general);
		Assert.assertTrue(Reqs);
		Assert.assertTrue(Res);
		Assert.assertTrue(Offer);
		Assert.assertTrue(Apply);
		Cr.Apply();
		
		Cr.Form(Name,Email,Mob,CV);
		
		boolean name = Cr.InName.isDisplayed();
		boolean email = Cr.InEmail.isDisplayed();
		boolean mob = Cr.InMob.isDisplayed();
		boolean message = Cr.Message.isDisplayed();
		boolean Robot = Cr.Robot.isDisplayed();
		
		Assert.assertTrue(name);
		Assert.assertTrue(email);
		Assert.assertTrue(mob);
		Assert.assertTrue(message);
		Assert.assertTrue(Robot);

		
		Cr.Cancel();
		
	}
	
	
	
}
