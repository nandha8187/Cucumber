package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public 	WebDriver driver;
	
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;

	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditno ;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cardtype;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement month;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement year;
	
	
	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	private WebElement cvno;
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public Book_Hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditno() {
		return creditno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getcvno() {
		return cvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	
	
	
	
	

}