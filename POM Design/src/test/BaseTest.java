package test;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.AdminPage;
import mainjava.LoginPage;
import mainjava.PimPage;
//import mainjava.TimePage;
import mainjava.TimePage;

public class BaseTest {
	public static WebDriver driver;
	protected  LoginPage loginPage;
	protected  PimPage pimPage;
	protected  TimePage timePage;
	protected AdminPage adminPage;
	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();///from server it dwonloaad file from chrome druver website
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();//
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pageObjects() {
		loginPage= new  LoginPage(driver);
		pimPage= new PimPage(driver);
		timePage=new TimePage(driver);  // object cration
		adminPage= new AdminPage(driver);
	}
	@AfterClass
	public void tearDownEnviornment() {
		driver.quit();
	}
	

}
