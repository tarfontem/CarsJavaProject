package testCases;



import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CarsHeaderPageObjects;
import pageObjects.SignInPageObjects;

public class SignInTest {
	static String validEmail = "tardzfont@yahoo.com";
	static String validPassword = "fti221987";
	static String invalidEmail = "tardzfont1@yahoo.com";
	static String invalidPassword = "fti22198700";
	static String invalidPassword1 = "fti2219";
	
	

		/**
		@Test
		public void verifySignInPageComponents() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
						
						
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			carsHeaderObjects.signInLink().click();
			Thread.sleep(3000);
			Assert.assertEquals(signInPageObjects.emailBox().getAttribute("maxlength"),"255");
			Assert.assertEquals(signInPageObjects.passwordBox().getAttribute("maxlength"),"255");
			assertTrue(signInPageObjects.forgotPasswordLink().getText().equalsIgnoreCase("Forgot password?"));
			assertTrue(signInPageObjects.signInButton().getText().equalsIgnoreCase("sign in"));
			Assert.assertEquals(signInPageObjects.facebookLoginIcon().getAttribute("data-linkname"),"signin-social-facebook");
			Assert.assertEquals(signInPageObjects.googleLoginIcon().getAttribute("data-linkname"),"signin-social-google");
			Assert.assertEquals(signInPageObjects.appleLoginIcon().getAttribute("class"),"sds-button apple-button");
			driver.close();
			
		
						
		}
		
		@Test
		public void verifySignInWithValidUserData() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
						
						
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			String initialTitle = signInPageObjects.getPageTitle();
			carsHeaderObjects.signInLink().click();
			String titleBeforLogin = signInPageObjects.getPageTitle();
			String expectedTitle = "Cars.com | Cars.com";
			assertTrue(titleBeforLogin.equals(expectedTitle));
			Thread.sleep(3000);
			signInPageObjects.emailBox().sendKeys(validEmail);
			signInPageObjects.passwordBox().sendKeys(validPassword);
			signInPageObjects.signInButton().click();
			Thread.sleep(3000);
			String finalTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
			assertTrue(finalTitle.equals(initialTitle));
			assertTrue(signInPageObjects.loggedInUserName().getText().contains("Ive Tard"));
			signInPageObjects.loggedInUserName().click();
			signInPageObjects.SignOutLink().click();
			assertTrue(signInPageObjects.getPageTitle().equals(finalTitle));
			driver.close();
				
		}
		
	
	@Test
	public void verifyFailedLoginWithAllWrongData() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		carsHeaderObjects.signInLink().click();
		Thread.sleep(3000);
		signInPageObjects.emailBox().sendKeys(invalidEmail);
		signInPageObjects.passwordBox().sendKeys(invalidPassword);
		signInPageObjects.signInButton().click();
		Thread.sleep(3000);
		
		assertTrue(signInPageObjects.wrongUserNotification().getText().contains("Try again soon"));
		driver.close();
			
	}
	
	
	@Test
	public void verifyFailedLoginWithInvalidPassword() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		carsHeaderObjects.signInLink().click();
		Thread.sleep(3000);
		signInPageObjects.emailBox().sendKeys(validEmail);
		signInPageObjects.passwordBox().sendKeys(invalidPassword);
		signInPageObjects.signInButton().click();
		Thread.sleep(3000);
		
		assertTrue(signInPageObjects.wrongUserNotification().getText().contains("Try again soon"));
		driver.close();
		
	}
	
	
	
	@Test
	public void verifyFailedLoginWithPasswordLessThanEightCharacters() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		carsHeaderObjects.signInLink().click();
		Thread.sleep(3000);
		signInPageObjects.emailBox().sendKeys(validEmail);
		signInPageObjects.passwordBox().sendKeys(invalidPassword1);
		signInPageObjects.signInButton().click();
		Thread.sleep(3000);
		
		assertTrue(signInPageObjects.wrongUserNotification().getText().contains("Try again soon"));
		driver.close();
		
	}
	*/
		
		

}
