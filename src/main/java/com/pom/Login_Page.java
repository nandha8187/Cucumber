package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {


	public WebDriver driver; //------null
	
	
       @FindBy(id = "login")
       
       private WebElement login_Btn;

	public Login_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
       
       









}

