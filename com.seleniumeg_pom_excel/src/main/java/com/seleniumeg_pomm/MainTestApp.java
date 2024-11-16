package com.seleniumeg_pomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTestApp {
public static void main(String[] args) throws Exception{
	
	//set system property for webdriver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

	//create driver instance
	WebDriver driver = new ChromeDriver();
	//Open html page (replace with actual url)
	driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg_pomm\\src\\main\\resources\\Home.html");
	//create home page instance
	HomePage homePage = new HomePage(driver);
	
	//on home page click about page
	AboutPage aboutPage = homePage.gotoAboutPage();
	aboutPage.showMoreInfo();
	Thread.sleep(2000);
	aboutPage.validateShowMore();

	ContactPage contactPage = homePage.gotoContactPage();
	Thread.sleep(3000);
	
	//from above aboutlink go back to home page
	aboutPage.gotoHomePage();

	Thread.sleep(3000);
	aboutPage.gotoContactPage();
	Thread.sleep(3000);
	contactPage.fillContactForm("abcd","abc@gmail.com","Messagesss");
	Thread.sleep(3000);
	contactPage.checkSubmission();
	Thread.sleep(1000);

	driver.quit();
}	
	

}
