package bassTest;



import org.apache.poi.ss.formula.ptg.AddPtg;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orasi.utils.TestReporter;
import com.orasi.web.OrasiDriver;
import com.orasi.web.WebBaseTest;

import bluesource.Login;

public class Addproject extends WebBaseTest {
	
	@Test 
	public void Add () {
		TestReporter.setDebugLevel(2);
		
		//setApplicationUnderTest("Bluesource");
		
		setPageURL("https://bluesourcestaging.herokuapp.com");
		testStart("Search Succesful");
		
		Login Login = new Login(); 
		Login.login();
		
		Search Search = new Search();
		Search.SearchPage(); 
	
		Addproject add = new Addproject();
		add.NewProject(); 
	
	}
	
	
}
