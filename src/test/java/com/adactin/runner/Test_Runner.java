package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				
		features = "C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
		
		glue ="com.sd",
		
		monochrome = true,
		
		dryRun = true,
		
		//tags= ("@Ad1"),
		
		
		plugin = {
				
				"html:Reports/hotel.html",
				
				"json:Reports/Jsonreport.json",
				
				
				"pretty",
				
				//"usage",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
		       
		}
		
				
				
	)			
					
	

public class Test_Runner {
	
	public static WebDriver driver; //----------------->null
	
	
	      @BeforeClass
	      public static void set_Up() {
          
	    	  driver =Base_Class.Browser_config("chrome");
	    	  
	    	  
		}
	      @AfterClass
	      public static void tear_Down() {
		
	    	  driver.close();
		}
	

}
