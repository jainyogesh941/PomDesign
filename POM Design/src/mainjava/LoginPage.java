package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
	// all the locators of page
	
	@FindBy(xpath="//*[@name='username']")
	WebElement userName;
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btnLogin;
	
	
	//Initialization of locators/variables
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	// methods required to perform the task
	public void loginMethod() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();
	}	
     public String loginPage() {
    	 return btnLogin.getText();
     }
}
