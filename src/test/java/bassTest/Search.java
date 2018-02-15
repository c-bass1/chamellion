package bassTest;



import org.testng.annotations.Test;

import com.orasi.utils.TestReporter;
import com.orasi.web.WebBaseTest;

import bluesource.Login;

public class Search extends WebBaseTest {
	
	@Test 
	public void SearchPage() {
		TestReporter.setDebugLevel(2);
		
		//setApplicationUnderTest("Bluesource");
		
		setPageURL("https://bluesourcestaging.herokuapp.com");
		testStart("Search Succesful");
		
		Login Login = new Login(); 
		Login.login();
		
		Search Search = new Search();
		Search.SearchPage(); 
	
	
	}
	
	
}
