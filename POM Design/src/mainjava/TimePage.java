package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class TimePage extends BaseTest {
	
	@FindBy(xpath="//*[text()='Time']")
	WebElement timebutton;
	
	public TimePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void time() {
		timebutton.click();
		
}
	public String titleOfPage() {
		return timebutton.getText();
	}
}

