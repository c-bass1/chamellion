package bluesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orasi.DriverManager;
import com.orasi.web.OrasiDriver;
import com.orasi.web.webelements.Button;
import com.orasi.web.webelements.Element;
import com.orasi.web.webelements.Textbox;
import com.orasi.web.webelements.impl.internal.ElementFactory;

public class Login {
	private OrasiDriver driver=null;
	
	@FindBy(id = "employee_username") private Textbox txtUsername;
	@FindBy(id = "employee_password") private Textbox txtPassword;
	@FindBy(name = "commit") private Button btnLogin; 
	public Login() {
		this.driver = DriverManager.getDriver();
		ElementFactory.initElements(driver,this);
	
	}
	
	
	
	@SuppressWarnings("null")
	public void login() {
		txtUsername.set("company.admin");
		txtPassword.set("123");
		btnLogin.click(); 
		
			
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		 WebElement element = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		 Assert.assertTrue(true);
	
	}
}
