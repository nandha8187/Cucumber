package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confiration1 {


	public 	WebDriver driver;
	

	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement itenary;
	
	@FindBy(id="logout")
	private WebElement logout;

	
		
		public Booking_Confiration1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
		}

		public WebElement getItenary() {
		return itenary;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	
	
}