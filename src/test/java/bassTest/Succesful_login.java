package bassTest;



import org.testng.annotations.Test;

import com.orasi.utils.TestReporter;
import com.orasi.web.WebBaseTest;

import bluesource.Login;
import bluesource.SearchPage;

public class Succesful_login extends WebBaseTest {
	
	@Test 
	public void Succesful() {
		TestReporter.log("Succesful login");
		TestReporter.setDebugLevel(2);
		
		//setApplicationUnderTest("Bluesource");
		
		setPageURL("https://bluesourcestaging.herokuapp.com");
		testStart("Search Succesful");
		
		Login Login = new Login(); 
		Login.login();
		
	
	}
	
	
}
