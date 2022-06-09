package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	public class HomePageObjects {
	
		WebDriver driver;
		
		public HomePageObjects (WebDriver driver) {
			
			this.driver = driver;
			
	}
		
		By makeOption = By.cssSelector("#by-make");
		By bodyStyleOption = By.cssSelector("#by-body-style");
		By makeNewOrUsed = By.cssSelector("#make-model-search-stocktype");
		By makeMakes = By.cssSelector("#makes");
		By makeModels = By.cssSelector("#models");
		By makePrice = By.cssSelector("#make-model-max-price");
		By makeDistance = By.cssSelector("#make-model-maximum-distance");
		By makeZip = By.cssSelector("#make-model-zip");
		By makeSearch = By.cssSelector("button[data-linkname='search-all-make']");	
		By makeSearchResult = By.cssSelector("div.vehicle-card");
		
		By bodyNewOrUsed = By.cssSelector("#bodystyle-search-stocktype");
		By bodyBodyStyle = By.cssSelector("#style");
		By bodyPrice = By.cssSelector("#bodystyle-max-price");
		By bodyDistance = By.cssSelector("#bodystyle-maximum-distance");
		By bodyZip = By.cssSelector("#bodystyle-zip");
		By bodySearch = By.cssSelector("button[data-searchtype='bodystyle']");
		
		By whatMattersBody = By.cssSelector("#body_style");
		By whatMattersPrice = By.cssSelector("#max_price");
		By whatMattersNext = By.cssSelector(".lifestyle-field__submit > button.sds-button");
		By matchMaker = By.cssSelector("section.sds-page-section--header > h1.sds-heading--1");
		By searchMatchSearch = By.cssSelector("li .mm-result");
		By SearchAvailabilty = By.cssSelector("div > button.lead-form-modal-button--desktop");		
		
		
		
		
		public WebElement makeOptionSwitch() {
			return driver.findElement(makeOption);
		}
		
		
		public WebElement bodyStyleOptionSwitch() {
			return driver.findElement(bodyStyleOption);
		}
		
		public WebElement makeNewOrUsedDropdown() {
			return driver.findElement(makeNewOrUsed);
		}
		
		public WebElement makeMakeDropdown() {
			return driver.findElement(makeMakes);
		}
		
		public WebElement makeModelDropdown() {
			return driver.findElement(makeModels);
		}
		
		public WebElement makePriceDropdown() {
			return driver.findElement(makePrice);
		}
		
		
		public WebElement makeDistanceDropdown() {
			return driver.findElement(makeDistance);
		}
		
		public WebElement makeZipBox() {
			return driver.findElement(makeZip);
		}
		
		public WebElement makeSearchButton() {
			return driver.findElement(makeSearch);
		}
		
		public WebElement bodyNewOrUsedDropdown() {
			return driver.findElement(bodyNewOrUsed);
		}
		
		public WebElement bodyStyleDropdown() {
			return driver.findElement(bodyBodyStyle);
		}
		
		public WebElement bodyPriceDropdown() {
			return driver.findElement(bodyPrice);
		}
		
		public WebElement bodyDistanceDropdown() {
			return driver.findElement(bodyDistance);
		}
		
		public WebElement bodyZipBox() {
			return driver.findElement(bodyZip);
		}
		
		public WebElement bodySearchButton() {
			return driver.findElement(bodySearch);
		}
		
		public WebElement whatMattersBodyDropdown() {
			return driver.findElement(whatMattersBody);
		}
		
		public WebElement whatMattersPriceDropdown() {
			return driver.findElement(whatMattersPrice);
		}
		

		public WebElement whatMattersNextButton() {
			return driver.findElement(whatMattersNext);
		}
		
		public WebElement matchMakerHeading() {
			return driver.findElement(matchMaker);
		}
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public List<WebElement> matchSearchResults() {
			return driver.findElements(searchMatchSearch);
		}
		
		public List<WebElement> matchMakeSearchResults() {
			return driver.findElements(makeSearchResult);
		}
		
		public List<WebElement> checkAvailabilty() {
			return driver.findElements(SearchAvailabilty);
		}

		




}
