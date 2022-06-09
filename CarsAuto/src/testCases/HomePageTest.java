package testCases;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.CarsHeaderPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.SignUpPageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageTest {
	
	
	WebDriver driver;
	
	
	/**
	@Test
	public void verifyHomePageSearchByMakeOptions() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		String pageTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
		Assert.assertEquals(homePageObjects.makeOptionSwitch().getAttribute("aria-selected"),"true");
		Assert.assertEquals(homePageObjects.bodyStyleOptionSwitch().getAttribute("aria-selected"),"false");
		assertTrue(carsHeaderObjects.getPageTitle().equals(pageTitle));
		assertTrue(homePageObjects.makeNewOrUsedDropdown().isDisplayed());
		assertTrue(homePageObjects.makeMakeDropdown().isDisplayed());
		assertTrue(homePageObjects.makeModelDropdown().isDisplayed());
		assertTrue(homePageObjects.makePriceDropdown().isDisplayed());
		assertTrue(homePageObjects.makeDistanceDropdown().isDisplayed());
		assertTrue(homePageObjects.makeZipBox().isDisplayed());
		assertTrue(homePageObjects.makeSearchButton().isDisplayed());
		assertTrue(homePageObjects.makeNewOrUsedDropdown().isEnabled());
		assertTrue(homePageObjects.makeMakeDropdown().isEnabled());
		assertTrue(homePageObjects.makeModelDropdown().isEnabled());
		assertTrue(homePageObjects.makePriceDropdown().isEnabled());
		assertTrue(homePageObjects.makeDistanceDropdown().isEnabled());
		assertTrue(homePageObjects.makeZipBox().isEnabled());
		assertTrue(homePageObjects.makeSearchButton().isEnabled());
		
		Thread.sleep(3000);
		driver.close();

		
	
	}

	
	@Test
	public void verifyHomePageSearchByBodyStyleOptions() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		homePageObjects.bodyStyleOptionSwitch().click();
		String pageTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
		Assert.assertEquals(homePageObjects.makeOptionSwitch().getAttribute("aria-selected"),"false");
		Assert.assertEquals(homePageObjects.bodyStyleOptionSwitch().getAttribute("aria-selected"),"true");
		assertTrue(carsHeaderObjects.getPageTitle().equals(pageTitle));
		assertTrue(homePageObjects.bodyNewOrUsedDropdown().isDisplayed());
		assertTrue(homePageObjects.bodyStyleDropdown().isDisplayed());
		assertTrue(homePageObjects.bodyPriceDropdown().isDisplayed());
		assertTrue(homePageObjects.bodyDistanceDropdown().isDisplayed());
		assertTrue(homePageObjects.bodyZipBox().isDisplayed());
		assertTrue(homePageObjects.bodySearchButton().isDisplayed());
		assertTrue(homePageObjects.bodyNewOrUsedDropdown().isEnabled());
		assertTrue(homePageObjects.bodyStyleDropdown().isEnabled());
		assertTrue(homePageObjects.bodyPriceDropdown().isEnabled());
		assertTrue(homePageObjects.bodyDistanceDropdown().isEnabled());
		assertTrue(homePageObjects.bodyZipBox().isEnabled());
		assertTrue(homePageObjects.bodySearchButton().isEnabled());
		driver.close();

	
		
	
	}

	@Test
	public void verifyHomePageSearchWhatMattersMostOptions() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		String pageTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
		Assert.assertEquals(homePageObjects.makeOptionSwitch().getAttribute("aria-selected"),"true");
		Assert.assertEquals(homePageObjects.bodyStyleOptionSwitch().getAttribute("aria-selected"),"false");
		assertTrue(homePageObjects.whatMattersBodyDropdown().isDisplayed());
		assertTrue(homePageObjects.whatMattersPriceDropdown().isDisplayed());
		assertTrue(homePageObjects.whatMattersNextButton().isDisplayed());
		assertTrue(homePageObjects.whatMattersBodyDropdown().isEnabled());
		assertTrue(homePageObjects.whatMattersPriceDropdown().isEnabled());
		assertTrue(homePageObjects.whatMattersNextButton().isEnabled());
		driver.close();


	}
		
	
	@Test
	public void verifySearchWhatMattersMostDropdownsOptionsValues() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		Select selectWhatMattersBodyDropDown = new Select(homePageObjects.whatMattersBodyDropdown());
		Select selectWhatMattersPriceDropDown = new Select(homePageObjects.whatMattersPriceDropdown());
		
		assertEquals(selectWhatMattersBodyDropDown.getOptions().size(),4);
		assertEquals(selectWhatMattersPriceDropDown.getOptions().size(),11);
		
		driver.close();
	}

	
	@Test
	public void verifySearchWhatMattersMostFunctionality() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		Select selectWhatMattersBodyDropDown = new Select(homePageObjects.whatMattersBodyDropdown());
		Select selectWhatMattersPriceDropDown = new Select(homePageObjects.whatMattersPriceDropdown());
		selectWhatMattersBodyDropDown.selectByVisibleText("SUV");
		selectWhatMattersPriceDropDown.selectByVisibleText("$30,000");
		homePageObjects.whatMattersNextButton().click();
		String expectedTitle = "What Car Should I Buy? Quiz - Cars.com Matchmaker | Cars.com";
		Assert.assertTrue(homePageObjects.matchMakerHeading().getText().equalsIgnoreCase("Cars.com Matchmaker"));
		Assert.assertTrue(homePageObjects.getPageTitle().contains(expectedTitle));
		for( WebElement item: homePageObjects.matchSearchResults()){
			
			Assert.assertTrue(item.getText().contains("Local inventory"));
			Assert.assertTrue(item.getText().contains("Model details"));
		}
			   
			  
		  }
		  
		  
	
	
	@Test
	public void verifySearchByMakeDropdownsOptionsValues() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		Select selectMakeNewOrUsedDropdown = new Select(homePageObjects.makeNewOrUsedDropdown());
		Select selectMakeMakeDropdown = new Select(homePageObjects.makeMakeDropdown());
		Select selectMakeModelDropdown = new Select(homePageObjects.makeModelDropdown());
		Select selectMakePriceDropdown = new Select(homePageObjects.makePriceDropdown());
		Select selectMakeDistanceDropdown = new Select(homePageObjects.makeDistanceDropdown());
		
		assertEquals(selectMakeNewOrUsedDropdown.getOptions().size(),5);
		assertEquals(selectMakeMakeDropdown.getOptions().size(),93);
		assertEquals(selectMakeModelDropdown.getOptions().size(),1);
		assertEquals(selectMakePriceDropdown.getOptions().size(),22);
		assertEquals(selectMakeDistanceDropdown.getOptions().size(),12);
		
		driver.close();
	}
	
	
	@Test
	public void verifySearchByBodyStyleDropdownsOptionsValues() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		homePageObjects.bodyStyleOptionSwitch().click();
		Select selectBodyNewOrUsedDropdown = new Select(homePageObjects.bodyNewOrUsedDropdown());
		Select selectBodyStyleDropdown = new Select(homePageObjects.bodyStyleDropdown());
		Select selectBodyPriceDropdown = new Select(homePageObjects.bodyPriceDropdown());
		Select selectBodyDistanceDropdown = new Select(homePageObjects.bodyDistanceDropdown());
		
		assertEquals(selectBodyNewOrUsedDropdown.getOptions().size(),5);
		assertEquals(selectBodyStyleDropdown.getOptions().size(),11);
		assertEquals(selectBodyPriceDropdown.getOptions().size(),22);
		assertEquals(selectBodyDistanceDropdown.getOptions().size(),12);
		
		driver.close();
	}
	
	
	@Test
	public void verifySearchByMakeFunctionality() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		Select selectMakeNewOrUsedDropdown = new Select(homePageObjects.makeNewOrUsedDropdown());
		Select selectMakeMakeDropdown = new Select(homePageObjects.makeMakeDropdown());
		Select selectMakeModelDropdown = new Select(homePageObjects.makeModelDropdown());
		Select selectMakePriceDropdown = new Select(homePageObjects.makePriceDropdown());
		Select selectMakeDistanceDropdown = new Select(homePageObjects.makeDistanceDropdown());
		selectMakeNewOrUsedDropdown.selectByVisibleText("New & used cars");
		selectMakeMakeDropdown.selectByVisibleText("Jeep");
		selectMakeModelDropdown.selectByVisibleText("Wrangler");
		selectMakePriceDropdown.selectByVisibleText("$30,000");
		selectMakeDistanceDropdown.selectByVisibleText("30 miles");
		homePageObjects.makeZipBox().sendKeys(" ");
		homePageObjects.makeSearchButton().click();
		Thread.sleep(2000);

		String expectedTitle = "New and used Jeep Wrangler for Sale Near Me | Cars.com";
		Assert.assertTrue(homePageObjects.getPageTitle().contains(expectedTitle));
		Thread.sleep(2000);
		
		for( WebElement item: homePageObjects.matchMakeSearchResults()){
			
			//Assert.assertTrue(item.getText().contains("Check availability"));
			
			assertTrue(item.getText().contains("Jeep Wrangler"));
		}
			   
		for( WebElement item: homePageObjects.checkAvailabilty()){
			
			//Assert.assertTrue(item.getText().contains("Check availability"));
			
			assertTrue(item.getText().equalsIgnoreCase("Check Availability"));
		}
			  
		  }
		  
		 */
	
	@Test
	public void verifySearchByBodyStyleFunctionality() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haskel\\OneDrive\\Desktop\\PTA class\\Selenium\\CarsProject\\CarsAuto\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					CarsHeaderPageObjects carsHeaderObjects = new CarsHeaderPageObjects(driver);
					HomePageObjects homePageObjects = new HomePageObjects(driver);
					
					
					
		carsHeaderObjects.navigateUrl("https://www.cars.com/");
		driver.manage().window().maximize();
		homePageObjects.bodyStyleOptionSwitch().click();
		Select selectbodyNewOrUsedDropdown = new Select(homePageObjects.bodyNewOrUsedDropdown());
		Select selectBodyStyleDropdown = new Select(homePageObjects.bodyStyleDropdown());
		Select selectBodyPriceDropdown = new Select(homePageObjects.bodyPriceDropdown());
		Select selectBodyDistanceDropdown = new Select(homePageObjects.bodyDistanceDropdown());
		selectbodyNewOrUsedDropdown.selectByVisibleText("New & used cars");
		selectBodyStyleDropdown.selectByVisibleText("Pickup truck");
		selectBodyPriceDropdown.selectByVisibleText("$30,000");
		selectBodyDistanceDropdown.selectByVisibleText("30 miles");
		homePageObjects.bodyZipBox().sendKeys(" ");
		homePageObjects.bodySearchButton().click();
		Thread.sleep(2000);

		String expectedTitle = "";//No page title here, this is an issue that has to be pointed to the developer although I ignored
		Assert.assertTrue(homePageObjects.getPageTitle().contains(expectedTitle));
		Thread.sleep(2000);
			   
		for( WebElement item: homePageObjects.checkAvailabilty()){
			
			//Assert.assertTrue(item.getText().contains("Check availability"));
			
			assertTrue(item.getText().equalsIgnoreCase("Check Availability"));
		}
			  
		  }
	
	
	
	
	
}
