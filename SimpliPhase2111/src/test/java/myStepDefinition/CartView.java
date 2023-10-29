package myStepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pageObject.WebObject;

public class CartView{
	WebObject pom = new WebObject();
	WebDriver driver = new EdgeDriver();
	
	
	@Given("I am on any page of swiggy website")
	public void i_am_on_any_page_of_swiggy_website() {
		System.out.println("i_am_on_any_page_of_swiggy_website");
	}
	
	

	@When("I click cart option and delete items from the cart")
	public void i_click_cart_option_and_delete_items_from_the_cart() {

		System.out.println("i_click_cart_option_and_delete_items_from_the_cart");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.Add_to_cart(driver);
		pom.deleteCart(driver);
	}



	@Then("I able to delete the  items from cart")
	public void i_able_to_delete_the_items_from_cart() {

		System.out.println("i_able_to_delete_the_items_from_cart");
		
	}
	
	
	

	@When("I click cart option and update items from the cart")
	public void i_click_cart_option_and_update_items_from_the_cart() {

		System.out.println("i_click_cart_option_and_update_items_from_the_cart");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.Add_to_cart(driver);
		pom.updateCart(driver);
	}

	
   @Then("I able to update the  items from cart")
	public void i_able_to_update_the_items_from_cart() {

		System.out.println("i_able_to_update_the_items_from_cart");
	}



}
