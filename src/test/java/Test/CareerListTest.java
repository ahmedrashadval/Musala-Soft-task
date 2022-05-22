package Test;

import org.testng.annotations.Test;

import Pages.CareersList;

public class CareerListTest extends TestBase {
	
	CareersList CL;
	
	@Test(priority =4 , alwaysRun=true)
	public void CareersSofia() {
		
		CL= new CareersList(driver);
		
		System.out.println("Sofia");
		
		CL.SofiaPos();
		
		
//		System.out.println("Skopje");
		
//		CL.SkopjePos();
		
		
		
		
		
		
		
		
		
		
		
	}

}
