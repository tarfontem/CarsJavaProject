package testCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CarsHeaderPageObjects;



public class HeaderElementsTest {
	
	@Test
	public void verifyAllMenuComponents() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		String newTitle = carsHeaderObjects.getPageTitle();
		String expectedTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
		assert (newTitle.equals(expectedTitle));
		Thread.sleep(4000);
		assertTrue(carsHeaderObjects.carsForSaleLink().getText().contains("Cars for Sale"));
		assertTrue(carsHeaderObjects.researchAndReviewsLink().getText().contains("Research & Reviews"));
		assertTrue(carsHeaderObjects.newsAndVideosLink().getText().contains("News & Videos"));
		assertTrue(carsHeaderObjects.sellYourCarLink().getText().contains("Sell Your Car"));
		assertTrue(carsHeaderObjects.serviceAndRepairsLink().getText().contains("Service & Repair"));
		//assertTrue(carsHeaderObjects.signInLink().getText().contains("Sign In"));
		//assertTrue(carsHeaderObjects.signUpLink().getText().contains("Sign Up"));
		assertTrue(carsHeaderObjects.signInLink().getText().equalsIgnoreCase("Sign in"));//use equalsIgnoreCase when contains does not match
		assertTrue(carsHeaderObjects.signUpLink().getText().equalsIgnoreCase("Sign Up"));
		driver.close();
	
					
	}
	



}
