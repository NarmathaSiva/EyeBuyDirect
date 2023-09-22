package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.SighIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SighInStep extends BaseClass {

	@Given("User has to enter {string} and {string}")
	public void user_has_to_enter_and(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);	

		SighIn s = new SighIn();

		WebElement eMail = s.geteMail();
		passValues(eMail, string);
		
		WebElement pw = s.getPw();
        passValues(pw, string2);

	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() throws InterruptedException {
	    Thread.sleep(5000);	
	
		SighIn s = new SighIn();

		WebElement sighIn1 = s.getSighIn1();
		clickElement(sighIn1);
	}

	@Then("User has to verify the credentials page")
	public void user_has_to_verify_the_credentials_page() throws InterruptedException {
	    Thread.sleep(5000);	

        String uRL = driver.getCurrentUrl();
		
        if (uRL.contains("passport")) {
    		System.out.println("Invalid Credential Page");
    	} 
        else {
    		System.out.println("Valid Credential Page");
    	}
		}
      
}
