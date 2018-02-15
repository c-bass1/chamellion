package bluesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orasi.DriverManager;
import com.orasi.web.OrasiDriver;
import com.orasi.web.webelements.Textbox;
import com.orasi.web.webelements.impl.internal.ElementFactory;

public class SearchPage {
	private OrasiDriver driver=null;
	
	@FindBy(id = "input") private Textbox search;
	
	
	public SearchPage() {
		this.driver = DriverManager.getDriver();
		ElementFactory.initElements(driver,this);
	
	}
	
	
	
	public void  Search() {
		search.set("25u47hjd8t");
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resource-content\"]/div[1]/table/tbody/tr[2]/td[1]/a")));
		Assert.assertTrue(true);
	
		
		
	
		
		
		
			 
	}
		
		
		
		
		

	
		

		}
