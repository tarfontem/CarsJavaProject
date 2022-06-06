package testCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CarsHeaderPageObjects;
import pageObjects.SignInPageObjects;
import pageObjects.SignUpPageObjects;

public class SignUpTest {
	
	static String registeredEmail = "tardzfont@yahoo.com";
	static String inValidEmail = "tardzfont11@yahoo.com";
	static String validNonregisteredEmail = "goddbrown@gmail.com";
	static String nonEmail = "tardzfont11";
	static String nonStandardPassword = "1234567";//password should be at least 8 characters
	static String standardPassword = "12345678";
	static String firstName = "tar";
	static String lastName = "zec";
	
	

	@Test
	public void verifySignInPageComponents() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		carsHeaderObjects.signUpLink().click();
		Thread.sleep(3000);
		Assert.assertEquals(signUpPageObjects.firstNameBox().getAttribute("maxlength"),"255");
		Assert.assertEquals(signUpPageObjects.lastNameBox().getAttribute("maxlength"),"255");
		Assert.assertEquals(signUpPageObjects.emailBox().getAttribute("maxlength"),"255");
		Assert.assertEquals(signUpPageObjects.passwordBox().getAttribute("maxlength"),"255");
		Assert.assertEquals(signUpPageObjects.passwordConfirmBox().getAttribute("maxlength"),"255");
		assertTrue(signUpPageObjects.signUpButton().getText().equalsIgnoreCase("Sign up"));
		driver.close();		
	
	}

	


}
