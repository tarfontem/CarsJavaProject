package testCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import pageObjects.CarsHeaderPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.SellYourCarPageObjects;
import pageObjects.SignInPageObjects;
 
public class SellYourCarTest {
	
	WebDriver driver;
	static WebDriverWait wait;
	static String inValidVin = "3GCEC14X66G218";
	static String invalidPlateNumber = "3GCEC14X66G2182";
	static String validVin = "3GCEC14X66G218202";
	
	
	/**
	
	@Test	
public void verifySellYourCarPageOptionsByPlateNumber() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					SellYourCarPageObjects sellYourCarPageObjects = new SellYourCarPageObjects(driver);
				
		
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		carsHeaderObjects.sellYourCarLink().click();
		Thread.sleep(2000);
		String pageTitle = "Cars.com | Cars.com";
		Select selectLicensePlateStateDropdown = new Select(sellYourCarPageObjects.licensePlateState());
		Assert.assertEquals(sellYourCarPageObjects.licensePlateOption().getAttribute("aria-selected"),"true");
		Assert.assertEquals(sellYourCarPageObjects.vinOption().getAttribute("aria-selected"),"false");
		Assert.assertTrue(sellYourCarPageObjects.licensePlateNumberBox().isDisplayed());
		Assert.assertTrue(sellYourCarPageObjects.licensePlateState().isDisplayed());
		Assert.assertTrue(sellYourCarPageObjects.getStartedButton().isDisplayed());
		assertEquals(selectLicensePlateStateDropdown.getOptions().size(),53);
		assertTrue(sellYourCarPageObjects.getPageTitle().equals(pageTitle));
		driver.close();
		
		
				
		}
	
	
	@Test	
	public void verifySellYourCarPageOptionsByVin() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SellYourCarPageObjects sellYourCarPageObjects = new SellYourCarPageObjects(driver);
					
			
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			carsHeaderObjects.sellYourCarLink().click();
			Thread.sleep(2000);
			sellYourCarPageObjects.vinOption().click();
			String pageTitle = "Cars.com | Cars.com";
			Assert.assertEquals(sellYourCarPageObjects.licensePlateOption().getAttribute("aria-selected"),"false");
			Assert.assertEquals(sellYourCarPageObjects.vinOption().getAttribute("aria-selected"),"true");
			Assert.assertTrue(sellYourCarPageObjects.vinNumberBox().isDisplayed());
			Assert.assertTrue(sellYourCarPageObjects.getStartedButton().isEnabled());
			Assert.assertTrue(sellYourCarPageObjects.getPageTitle().equals(pageTitle));
			driver.close();
			
			
					
			}


	@Test	
	public void verifySaleByVinFunctionalityWithInvalidVin() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SellYourCarPageObjects sellYourCarPageObjects = new SellYourCarPageObjects(driver);
					
			
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			carsHeaderObjects.sellYourCarLink().click();
			Thread.sleep(2000);
			sellYourCarPageObjects.vinOption().click();
			sellYourCarPageObjects.vinNumberBox().sendKeys(invalidVin);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,350)", ""); 
			Thread.sleep(2000);
			sellYourCarPageObjects.getStartedButtonVin().click();
			Assert.assertTrue(sellYourCarPageObjects.wrongVinNotify().getText().contains("Enter a valid VIN (17 characters: numbers and letters only except I, O, and Q)."));
			
			driver.close();
			
			
					
			}
			
			
	
	@Test	
	public void verifySaleByLicemsePlateFunctionalityWithInvalidPlateNumber() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SellYourCarPageObjects sellYourCarPageObjects = new SellYourCarPageObjects(driver);
						SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
						SignInTest signInTest = new SignInTest();
						
					
			
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			carsHeaderObjects.signInLink().click();
			Thread.sleep(3000);
			signInPageObjects.emailBox().sendKeys(signInTest.validEmail);
			signInPageObjects.passwordBox().sendKeys(signInTest.validPassword);
			signInPageObjects.signInButton().click();
			carsHeaderObjects.sellYourCarLink().click();
			Thread.sleep(3000);
			sellYourCarPageObjects.licensePlateNumberBox().sendKeys(invalidPlateNumber);
			Select selectLicensePlateStateDropdown = new Select(sellYourCarPageObjects.licensePlateState());
			selectLicensePlateStateDropdown.selectByVisibleText("CA");
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,350)", ""); 
			Thread.sleep(2000);
			sellYourCarPageObjects.getStartedButton().click();
			Thread.sleep(2000);
			Assert.assertTrue(sellYourCarPageObjects.wrongPlateNumberNotify().getText().contains("We couldn't find a match. Try searching by VIN"));

			
			driver.close();
			
	
	}
	
	*/
	
	@Test	
	public void verifySaleByVinFunctionalityWithValidVin() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
						SellYourCarPageObjects sellYourCarPageObjects = new SellYourCarPageObjects(driver);
						SignInPageObjects signInPageObjects = new SignInPageObjects(driver);
						SignInTest signInTest = new SignInTest();
					
			
			carsHeaderObjects.navigateUrl("https://www.cars.com/");
			driver.manage().window().maximize();
			carsHeaderObjects.signInLink().click();
			Thread.sleep(3000);
			signInPageObjects.emailBox().sendKeys(signInTest.validEmail);
			signInPageObjects.passwordBox().sendKeys(signInTest.validPassword);
			signInPageObjects.signInButton().click();
			carsHeaderObjects.sellYourCarLink().click();
			Thread.sleep(3000);
			carsHeaderObjects.sellYourCarLink().click();
			Thread.sleep(2000);
			sellYourCarPageObjects.vinOption().click();
			sellYourCarPageObjects.vinNumberBox().sendKeys(validVin);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,350)", ""); 
			Thread.sleep(2000);
			sellYourCarPageObjects.getStartedButtonVin().click();
			Assert.assertTrue(sellYourCarPageObjects.listYourCarHeading().getText().contains("List your car"));
			
			driver.close();
			
			
					
			}
			
			
	
	
}
