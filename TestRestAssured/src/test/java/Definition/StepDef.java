package Definition;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDef {
	RestAssured restAssured;
//	restAssured.given();
	RequestSpecification given;
	Response response;

	@Given("set BaseURI as {string}")
	public void set_base_uri_as(String baseURI) {
	    // Write code here that turns the phrase above into concrete actions
	    restAssured.baseURI=baseURI;
	}
	@Given("set content-type")
	public void set_content_type() {
	    // Write code here that turns the phrase above into concrete actions
	    given = restAssured.given().contentType(ContentType.JSON);
	}
	@When("I use user as {int}")
	public void i_use_user_as(int ID) {
	    // Write code here that turns the phrase above into concrete actions
	    response = given.request(Method.GET,"/api/users/"+ID);
	}
	@Then("i got status code as {int}")
	public void i_got_status_code_as(int expStatusCode) {
	    // Write code here that turns the phrase above into concrete actions
	    int actStatusC=response.getStatusCode();
	    Assert.assertEquals(expStatusCode, actStatusC);
	}



}
