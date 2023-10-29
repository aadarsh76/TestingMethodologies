package com.loginSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		System.out.println("i_am_on_the_login_page");
	}
	@When("I enter a valid login details ")
	public void i_enter_a_valid_login_details() {
		System.out.println("i_enter_a_valid_login_details");
	}
	@When("I enter {String} and {String} ")
	public void i_enter_and(String un,String pwd) {
		System.out.println("Enter"+un+" "+pwd); 
		
	}
	@When("click on login")
	public void click_on_login() {
		System.out.println("click_on_login");
	}

}
