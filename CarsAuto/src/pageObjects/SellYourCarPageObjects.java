package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellYourCarPageObjects {
	
	WebDriver driver;
	

	
	public SellYourCarPageObjects (WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	By licensePlate = By.cssSelector("#by-plate");
	By vin  = By.cssSelector("#by-vin");
	By licensePlateNumber = By.cssSelector("#license_plate_number");
	By licensePlateState = By.cssSelector("#license_plate_state");
	By getStarted = RelativeLocator.with(By.tagName("button")).below(By.id("license_plate_number"));
	By vinNumber = By.cssSelector("#vin");
	By wrongVin = By.cssSelector("span.sds-helper-text");
	By wrongPlateNumber = By.cssSelector("div > span.sds-helper-text");
	By getStartedvin = RelativeLocator.with(By.tagName("button")).below(By.cssSelector("a[data-linkname='where-to-locate-vin']"));
	By listYourCar = By.cssSelector("h1.sds-page-section__title");
	
	
	public WebElement licensePlateOption() {
		return driver.findElement(licensePlate);
	}
	
	public WebElement vinOption() {
		return driver.findElement(vin);
	}
	
	public WebElement licensePlateNumberBox() {
		return driver.findElement(licensePlateNumber);
	}
	
	public WebElement licensePlateState() {
		return driver.findElement(licensePlateState);
	}
	
	public WebElement getStartedButton() {
		return driver.findElement(getStarted);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement vinNumberBox() {
		return driver.findElement(vinNumber);
	}
	
	public WebElement wrongVinNotify() {
		return driver.findElement(wrongVin);
	}
	
	public WebElement getStartedButtonVin() {
		return driver.findElement(getStartedvin);
	}
	
	public WebElement wrongPlateNumberNotify() {
		return driver.findElement(wrongPlateNumber);
	}
	
	public WebElement listYourCarHeading() {
		return driver.findElement(listYourCar);
	}
	
	
}
