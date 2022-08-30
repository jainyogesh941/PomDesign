package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class AdminPage extends BaseTest {
	
	@FindBy (xpath="//span[text()='Admin']")
	WebElement adminPagebtn;
	
   public AdminPage (WebDriver driver) {
	   this.driver= driver;
		PageFactory.initElements(driver, this);
   }
    public void adminMethod() {
    	adminPagebtn.click();
    }
     public String titleOfPage() {
    	 return adminPagebtn.getText();
     }

}
