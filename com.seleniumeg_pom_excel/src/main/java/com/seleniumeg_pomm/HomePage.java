package com.seleniumeg_pomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;

	//create locators
	private By aboutLink = By.id("aboutLink");
	private By contactLink = By.id("contactLink");
	private By subscribeForm = By.id("subscribeForm");
	private By email = By.id("email");
	private By subscribeButton = By.id("subscribeButton");
	private By acceptTerms = By.id("acceptTerms");
		
		//constructor expect webdriver as parameter
		public HomePage(WebDriver driver) {
			System.out.println("Disaplying home page!..."+driver.getTitle());
			this.driver = driver;
		}
		
		//methods to perform actions on above webelements
		public AboutPage gotoAboutPage() {
			WebElement aboutLinkElement = driver.findElement(aboutLink);
			aboutLinkElement.click();
			return new AboutPage(driver);
		}
		
		
		  public ContactPage gotoContactPage() { 
			  WebElement contactLinkElement = driver.findElement(contactLink); 
			  contactLinkElement.click(); 
			  return new  ContactPage(driver); 
			  }
		 
}
