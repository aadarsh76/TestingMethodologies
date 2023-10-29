package test.ra;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestRALib {

	
	public Response Getuser(int Id) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.GET,"api/unknown/"+Id);
		return response;
	}
	public Response Postuser() {
		JSONObject reqPar=new JSONObject();
		reqPar.put("name","aadarsh");
		reqPar.put("job","CEO");
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification given = RestAssured.given();
		given.body(reqPar.toString());
		given.header("Content-type","application/json");
		Response response = given.request(Method.POST,"/api/users");
		return response;

	}
}
