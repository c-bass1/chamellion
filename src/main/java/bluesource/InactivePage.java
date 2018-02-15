package bluesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orasi.DriverManager;
import com.orasi.web.OrasiDriver;
import com.orasi.web.webelements.Textbox;
import com.orasi.web.webelements.impl.internal.ElementFactory;

public class InactivePage {
	private OrasiDriver driver=null;
	
	@FindBy(tagName = "input") private Textbox search;
	
	
	public InactivePage() {
		this.driver = DriverManager.getDriver();
		ElementFactory.initElements(driver,this);
	
	}
	
	
	
	public void  Inactive() {

		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[6]/a")).click();
 
		
		WebDriverWait wait = new WebDriverWait(driver, 100);

		 WebElement element = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.id("Add Employee")));
		 
		 WebElement elem = driver.findElement(By.xpath("//*[@id=\"employee_status\"]/option[3]"));
		 new Select(elem).selectByVisibleText("Inactive");	
		 
		 
		 
		

		}
}


	
