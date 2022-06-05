package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 public class SignUpPageObjects {

	 WebDriver driver;
		
		public SignUpPageObjects (WebDriver driver) {
			
			this.driver = driver;
			
		}
		
		By firstName = By.cssSelector("#user_first_name");
		By lastName = By.cssSelector("#user_last_name");
		By email = By.cssSelector("#user_email2");
		By userPassword = By.cssSelector("#user_password");
		By userPasswordConfirm = By.cssSelector("#user_confirm_password");
		By signUp = By.cssSelector("button.sds-button");
		By signUpHead = By.cssSelector("sds-page-section__title");
		
		
		
		
		public WebElement firstNameBox() {
			return driver.findElement(firstName);
		}
		
		public WebElement lastNameBox() {
			return driver.findElement(lastName);
		}
		
		public WebElement emailBox() {
			return driver.findElement(email);
		}
		
		public WebElement passwordBox() {
			return driver.findElement(userPassword);
		}
		
		public WebElement passwordConfirmBox() {
			return driver.findElement(userPasswordConfirm);
		}
		
		public WebElement signUpButton() {
			return driver.findElement(signUp);
		}
		
		public WebElement signUpHeading() {
			return driver.findElement(signUpHead);
		}
		
		
		
		
}
