package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.AmazonPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSignSteps extends BaseClass {

	AmazonPojo a;

	@Given("Launch the chromeBrowser and maximize window")
	public void launch_the_chromeBrowser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("Launch the url of the amazon")
	public void launch_the_url_of_the_amazon() {
		launchUrl("https://www.amazon.in/");
	}

	@Then("I enter the  valid username")
	public void i_enter_the_valid_username() {
		a = new AmazonPojo();
		passText("arjunaariya007@gmail.com", a.getEmailOrMob());
	}

	@Then("I enter the invalid password")
	public void i_enter_the_invalid_password() {
		a = new AmazonPojo();
		passText("8667484170", a.getAmazonPwd());
	}

	@Then("I click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		a = new AmazonPojo();
		clickBtn(a.getNaviSign());
	}

	@Then("close the  page")
	public void close_the_page() {
		closeEntrieBrowser();
	}

}
