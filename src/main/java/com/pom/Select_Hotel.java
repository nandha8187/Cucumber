package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	
	public 	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement click;

	
	

	public Select_Hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getClick() {
		return click;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}