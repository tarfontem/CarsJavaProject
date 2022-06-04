package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarsHeaderPageObjects {
	
	WebDriver driver;
	
	public CarsHeaderPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	By carsForSale = By.cssSelector("a[data-linkname='header-buy']");
	By researchAndReviews = By.cssSelector("a[data-linkname='header-research']");
	By newsAndVideos = By.cssSelector("a[data-linkname='header-news']");
	By sellYourCar = By.cssSelector("a[data-linkname='header-sell-your-car']");
	By serviceAndRepairs = By.cssSelector("a[data-linkname='header-service']");
	By signIn = By.cssSelector(".header-signin");
	By signUp = By.cssSelector(".header-signup");
	
	
	public WebElement carsForSaleLink() {
		return driver.findElement(carsForSale);
	}
	
	public WebElement researchAndReviewsLink() {
		return driver.findElement(researchAndReviews);
	}
	
	public WebElement newsAndVideosLink() {
		return driver.findElement(newsAndVideos);
	}
	
	public WebElement sellYourCarLink() {
		return driver.findElement(sellYourCar);
	}
	
	public WebElement serviceAndRepairsLink() {
		return driver.findElement(serviceAndRepairs);
	}
	
	public WebElement signInLink() {
		return driver.findElement(signIn);
	}
	
	public WebElement signUpLink() {
		return driver.findElement(signUp);
	}
	
	public void navigateUrl(String url) {
		driver.get(url);
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}

