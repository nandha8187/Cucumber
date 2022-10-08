package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Detail {

	public 	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;

	
	public User_Detail(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	
	}
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
		
	
}