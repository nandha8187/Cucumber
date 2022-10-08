package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public 	WebDriver driver;
		
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy (xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy (xpath="//select[@name='room_nos']")
	private WebElement rooms;
	
	@FindBy (xpath="//select[@name='room_nos']")
	private WebElement checkindate;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement checkout;
	
	@FindBy (xpath="//select[@name='adult_room']")
	private WebElement adults;
	
	@FindBy (xpath="(//select[@class='search_combobox'])[6]")
	private WebElement childrenperroom;
	
	@FindBy (id="Submit")
	private WebElement submit;

	

	public Search_Hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

	public static void clear(WebElement element) {
		
		element.clear();
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
