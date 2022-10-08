package com.sd;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;
import com.base_class.Base_Class;
import com.helper.Page_Object_Manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class step_Def extends Base_Class {

	
    public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void before_Hooks(io.cucumber.java.Scenario s) {
		
		   String name = s.getName();
		   
		   System.out.println("Scenario Name :"+name);

	}
	
	@After
	public void after_Hooks(io.cucumber.java.Scenario s) throws Exception {
		
		
		if(s.isFailed()) {
			
			takeScreenshot("C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\ScreenShot");
		}
	
		         Status status = s.getStatus();
		         
		         System.out.println("Scenario status :"+status);
	}
	
	
	

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("https://adactinhotelapp.com");
	}


	@When("user Enter The {string} In User Field")
	public void user_enter_the_in_user_field(String Username) {

		inputKeys(pom.get_Instance_ud().getUsername(),Username); 

	}

	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String Password) {

		inputKeys(pom.get_Instance_ud().getPassword(),Password); 

	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Login().getLogin_Btn()); 
	}

	@When("^user Enter The Hotel Location$")
	public void user_Enter_The_Hotel_Location() throws Throwable {

		dropdown("byText",pom.get_Instance_Search().getLocation(), "Melbourne");

	}


	@When("user Select The {string}")
	public void user_select_the(String hotel) {

		dropdown("byText",pom.get_Instance_Search().getHotels(),hotel);


	}


	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {

		dropdown("byText",pom.get_Instance_Search().getHotels(),"Hotel Sunshine");

	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {

		dropdown("byIndex",pom.get_Instance_Search().getRoomtype(),"4");

	}

	@When("^user Select No's  Rooms$")
	public void user_Select_No_s_Rooms() throws Throwable {

		dropdown("byIndex",pom.get_Instance_Search().getRooms(),"1");

	}

	@When("^user Select Check In Date$")
	public void user_Select_Check_In_Date() throws Throwable {

		inputKeys(pom.get_Instance_Search().getCheckindate(),"02/02/2022");

	}

	@When("^user Select Check Out Date$")
	public void user_Select_Check_Out_Date() throws Throwable {

		inputKeys(pom.get_Instance_Search().getCheckout(),"04/02/2022");


	}

	@When("^user Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {

		dropdown("byIndex",pom.get_Instance_Search().getAdults(),"2");

	}

	@When("^user Select Children Per Room$")
	public void user_Select_Children_Per_Room() throws Throwable {

		dropdown("byIndex",pom.get_Instance_Search().getChildrenperroom(),"3");


	}

	@Then("^user Click On The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.get_Instance_Search().getSubmit());

	}

	@When("^user Select Any One Radio Button$")
	public void user_Select_Any_One_Radio_Button() throws Throwable {

		clickOnElement(pom.get_Instance_Select().getRadioButton());


	}

	@Then("^user Click On The Continue Button And It Navigate To Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_Hotel_Page() throws Throwable {

		clickOnElement(pom.get_Instance_Select().getClick());

		
		

	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {

		inputKeys(pom.get_Instance_book().getFirstname(),"NANDHA");

	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {

		inputKeys(pom.get_Instance_book().getLastname(),"KUMAR");

	}

	@When("^user Enter The 	Address$")
	public void user_Enter_The_Address() throws Throwable {

		inputKeys(pom.get_Instance_book().getAddress(),"2/21,PILLAIYAR kOVIL ST,ALINJIVAKKAM,CH-52");
	}

	@When("^user Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {

		inputKeys(pom.get_Instance_book().getCreditno(),"1234432156788756");

	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {

		dropdown("byIndex",pom.get_Instance_book().getCardtype(),"3");

	}

	@When("^user Select Card Expiry Month$")
	public void user_Select_Card_Expiry_Month() throws Throwable {

		dropdown("byIndex",pom.get_Instance_book().getMonth(),"4");

	}

	@When("^user Select Card Expiry Year$")
	public void user_Select_Card_Expiry_Year() throws Throwable {

		dropdown("byIndex",pom.get_Instance_book().getYear(),"12");

	}

	@When("^user Enter The CVV No$")
	public void user_Enter_The_CVV_No() throws Throwable {

		inputKeys(pom.get_Instance_book().getcvno(),"619");


	}

	@Then("^user Click On The Book Now Button And It Navigate To Booking Confirmation$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation() throws Throwable {

		clickOnElement(pom.get_Instance_book().getBooknow());
		sleep(5000);
	}

	@Then("^user Click On The My Itinary And It Navigate To Booked Itinary$")
	public void user_Click_On_The_My_Itinary_And_It_Navigate_To_Booked_Itinary() throws Throwable {
		clickOnElement(pom.get_Instance_booking().getItenary());

	}

	@Then("^user Click On The Logut Button And It Navigate To Successfully Logged Page$")
	public void user_Click_On_The_Logut_Button_And_It_Navigate_To_Successfully_Logged_Page() throws Throwable {
		clickOnElement(pom.get_Instance_booking().getLogout());

		sleep(3000);
	}

	@Then("^user Click On The Click Here To Login Again  Button And It Navigate To Login Page$")
	public void user_Click_On_The_Click_Here_To_Login_Again_Button_And_It_Navigate_To_Login_Page() throws Throwable {

	}



}