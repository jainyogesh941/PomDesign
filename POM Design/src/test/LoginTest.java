package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyLogin() {
		loginPage.loginMethod();
		
	}
	@Test
	public void loginPage() {
		loginPage.loginPage();
		Assert.assertEquals(loginPage.loginPage(),"Login");
	}

}
