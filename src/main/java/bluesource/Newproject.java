package bluesource;

import org.openqa.selenium.By;

import org.openqa.selenium.support.FindBy;

import com.orasi.DriverManager;
import com.orasi.web.OrasiDriver;
import com.orasi.web.webelements.Textbox;
import com.orasi.web.webelements.impl.internal.ElementFactory;

public class Newproject {
	private OrasiDriver driver=null;
	
	 
		@FindBy(id = "project_name") private Textbox project;
		
		
		
		
	public Newproject() {
		this.driver = DriverManager.getDriver();
		ElementFactory.initElements(driver,this);
		
		driver.findWebElement(By.xpath("//*[@id=\"all-content\"]/div[2]/div/div[2]/button")).click();
	
	}
	
	
	
	public void  Search() {
		project.set("159753");
		driver.findElement(By.xpath("//*[@id=\"new_project\"]/div[8]/input")).click();
		
		
		
	}
}