package com.seleniumeg_pomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	
	private WebDriver driver;
	//create locators
	private By homeLink = By.id("homeLink");
	private By contactLink = By.id("contactLink");
	private By showMoreButton = By.id("moreInfoButton");
	private By moreInfoDiv = By.id("moreInfo");

			//constructor expect webdriver as parameter
			public AboutPage(WebDriver driver) {
				System.out.println("Disaplying about page!..."+driver.getTitle());
				this.driver = driver;
			}
			
			//methods to perform actions on above webelements
			public HomePage gotoHomePage() {
				WebElement homeLinkElement = driver.findElement(homeLink);
				homeLinkElement.click();
				return new HomePage(driver);
			}
			
			 public ContactPage gotoContactPage() { 
				  WebElement contactLinkElement = driver.findElement(contactLink); 
				  contactLinkElement.click(); 
				  return new  ContactPage(driver); 
				  }
			 
			 public void showMoreInfo() { 
				  driver.findElement(showMoreButton).click(); 
				  }
			 
			 public void validateShowMore() {  
				  String moreinfo = driver.findElement(moreInfoDiv).getText();
				 System.out.println("More info..."+moreinfo);
				  }
}
