package Test;
import org.testng.annotations.Test;
import Pages.ContactUS;
import org.testng.Assert;


public class ContactUsTest extends TestBase {
	
	ContactUS go;
	
	@Test(priority =2 , alwaysRun=true)
	public void verification()
	{
		go = new ContactUS(driver);
		
		go.contactBTN(name,email,subject,message);
		  try {
		        Thread.sleep(10*500);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		Assert.assertEquals(go.errmsg.getText(),"The e-mail address entered is invalid.");
		go.Close();
		
	}
	
	
	
	
}