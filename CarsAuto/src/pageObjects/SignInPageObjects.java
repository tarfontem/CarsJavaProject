package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignInPageObjects {
	
	WebDriver driver;
	
	public SignInPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By email = By.cssSelector("#email");
	By password = By.cssSelector("#password");
	By signIn = By.cssSelector("button.sds-button");
	By forgotPassword = By.cssSelector(".password-help p a");
	By facebookSignIn = By.cssSelector("a.facebook-button");
	By googleSignIn = By.cssSelector("a.google-button");
	By appleSignIn = By.cssSelector("a.apple-button");
	By userName = By.cssSelector("span.desktop-nav-user-name");
	By signOut = By.linkText("Sign Out");
	By noUserInfo = By.cssSelector("p.sds-notification__desc");
	By forgottenpasswordHeading = By.cssSelector("h1.sds-page-section__title");
	By email2 = By.cssSelector("div input.sds-text-field");
	By passwordRecoverySubmit = By.cssSelector("button[data-linkname='forgot-password-submit']");
	By passwordSentHead = By.cssSelector("div.sds-notification__title");
	
	
	
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	
	public WebElement passwordBox() {
		return driver.findElement(password);
	}
	
	public WebElement signInButton() {
		return driver.findElement(signIn);
	}
	
	public WebElement forgotPasswordLink() {
		return driver.findElement(forgotPassword);
	}
	
	public WebElement facebookLoginIcon() {
		return driver.findElement(facebookSignIn);
	}
	
	
	public WebElement googleLoginIcon() {
		return driver.findElement(googleSignIn);
	}
	
	
	public WebElement appleLoginIcon() {
		return driver.findElement(appleSignIn);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement loggedInUserName() {
		return driver.findElement(userName);
	}
	
	public WebElement SignOutLink() {
		return driver.findElement(signOut);
	}
	
	public WebElement wrongUserNotification() {
		return driver.findElement(noUserInfo);
	}
	
	public WebElement passwordRecoveryHeading() {
		return driver.findElement(forgottenpasswordHeading);
	}
	
	public WebElement passwordRecoveryEmailBox() {
		return driver.findElement(email2);
	}
	
	public WebElement passwordRecoverySubmitButton() {
		return driver.findElement(passwordRecoverySubmit);
	}
	
	public WebElement passwordRecoverySentNotification() {
		return driver.findElement(passwordSentHead);
	}
	
	
	
	
	

}
