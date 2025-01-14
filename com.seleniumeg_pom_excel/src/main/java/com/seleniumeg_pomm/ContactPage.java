package com.seleniumeg_pomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	private WebDriver driver;
	//create locators
	private By homeLink = By.id("homeLink");
	private By aboutLink = By.id("aboutLink");
	private By nameField = By.id("name");
	private By emailField = By.id("email");
	private By messageField = By.id("message");
	private By submitButton = By.id("submitButton");
	private By rmessageDiv = By.id("rmessage");
			

			//constructor expect webdriver as parameter
			public ContactPage(WebDriver driver) {
				System.out.println("Disaplying contact page!..."+driver.getTitle());
				this.driver = driver;
			}
			
			public HomePage gotoHomePage() {
				WebElement homeLinkElement = driver.findElement(homeLink);
				homeLinkElement.click();
				return new HomePage(driver);
			}
			
			public AboutPage gotoAboutPage() {
				WebElement aboutLinkElement = driver.findElement(aboutLink);
				aboutLinkElement.click();
				return new AboutPage(driver);
			}
			
			public void fillContactForm(String name, String email, String message) {
				driver.findElement(nameField).sendKeys(name);
				driver.findElement(emailField).sendKeys(email);
				driver.findElement(messageField).sendKeys(message);
				driver.findElement(submitButton).click();
			}
			
			public String checkSubmission() {
				String message = driver.findElement(rmessageDiv).getText();
				System.out.println("submitted text: "+message);
				return message;			
			}
			
}
