package org.spd;

import java.util.List;

import org.bas.BaseClass;
import org.pojo.SignINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class FbRegistration extends BaseClass {

	SignINPojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		
		s = new SignINPojo();
		clickBtn(s.getCreateNewAccount());
	   
	}

	@When("To pass the firstname in firstname text box")
	public void to_pass_the_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		s = new SignINPojo();
		passText(l.get(2), s.getFirstNameTextBox());
	    
	}

	@When("To pass the secondname in secondname text box")
	public void to_pass_the_secondname_in_secondname_text_box() {
		s = new SignINPojo();
		passText("Kumar", s.getSecondNameTextBox());
	}

	@When("To pass the mobileno or email in email text box")
	public void to_pass_the_mobileno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		s = new SignINPojo();
		passText(l.get(1).get(2), s.getMobileorEmailTextBox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new SignINPojo();
		passText("456123", s.getNewPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	}


}
