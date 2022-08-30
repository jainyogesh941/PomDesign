package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminTest extends BaseTest {
	

	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test
	public void VerifyPage() {
		adminPage.adminMethod();
	}
	
	@Test
	public void verifyAdminPage() {
		
		Assert.assertEquals(adminPage.titleOfPage(), "Admin");
	}

}
