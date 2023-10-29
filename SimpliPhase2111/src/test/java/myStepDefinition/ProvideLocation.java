package myStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pageObject.WebObject;

public class ProvideLocation {
	WebDriver driver = new EdgeDriver();
	WebObject pom = new WebObject();
	
	
	

	@Given("I am on swiggy homepage website")
	public void i_am_on_swiggy_homepage_website() {
	
		System.out.println("i_am_on_swiggy_homepage_website");

		pom.home(driver);

	
	}
	@When("I click on Enter your delivery location")
	public void i_click_on_enter_your_delivery_location() {

		System.out.println("i_click_on_enter_your_delivery_location");

		pom.home(driver);
		pom.location1(driver);

		
	}

	@Then("I press enter to select location")
	public void i_press_enter_to_select_location() {
	   
		System.out.println("i_press_enter_to_select_location");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);

	}
	
	
	
	


	@Given("I am not on homepage")
	public void i_am_not_on_homepage() {

		System.out.println("i'm on any page of swiggy");

	}
	@When("I click on other location")
	public void i_click_on_other_location() {
	  
		System.out.println("i_click_on_other_location");

		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.UpdateLocation(driver);

	}

	@Then("I click on that location")
	public void i_click_on_that_location() {

		System.out.println("i_click_on_that_location \n\n");
	}



}
