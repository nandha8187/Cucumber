package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Booking_Confiration1;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.pom.User_Detail;

public class Page_Object_Manager {


	public WebDriver driver;

	//private className object

	private User_Detail ud;              //null

	private Login_Page lp;               //null

	private Search_Hotel sh;             //null

	private Select_Hotel shs;            //null

	private Book_Hotel bh;               //null

	private Booking_Confiration1 bc;     //null

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;

	}

	public User_Detail get_Instance_ud() {

		if (ud==null) {
		
			ud = new User_Detail(driver);

			}
		return ud;
	}

	public Login_Page get_Instance_Login() {

		if(lp==null) {
			
		lp =new Login_Page(driver);
		}
		return lp;


	}

	public Search_Hotel get_Instance_Search() {

		if(sh==null) {
		
		sh = new Search_Hotel(driver);		

		}
		return sh;


	}

	public Select_Hotel get_Instance_Select() {

		if(shs==null) {
		
		shs = new Select_Hotel(driver);

		}
		return shs;

	}


	
	public Book_Hotel get_Instance_book() {


		if(bh==null) {
			
		bh = new Book_Hotel(driver);
		
		}
		return bh;
	}

	
	public Booking_Confiration1 get_Instance_booking() {
		
        if(bc==null) {
		
		
	   bc = new Booking_Confiration1(driver); 
	
        }
		return bc; 
	}

	
	


}