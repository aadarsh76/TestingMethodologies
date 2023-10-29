package test.ra;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestParseRa {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification given = RestAssured.given();
		
		Response response = given.request(Method.GET, "/api/users");
		
		JsonPath jsonPath=new JsonPath(response.getBody().asString());
		
		System.out.println(jsonPath.get("data"));
		String expname="George";
		
//		Assert.assertEquals(expname,jsonPath.get("data.first_name"));
			
//		if(expname.equals(jsonPath.get("data.first_name"))) {
//		
//		System.out.println(jsonPath.get("data.first_name"));
//		
//		}
//		
		System.out.println(jsonPath.get("data[0].first_name"));
		}
}
