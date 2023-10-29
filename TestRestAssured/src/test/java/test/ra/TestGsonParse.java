package test.ra;

import org.json.JSONObject;

import com.google.gson.Gson;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGsonParse {

	public static void main(String[] args) {
		
		JSONObject obj=new JSONObject();
		obj.put("name", "Aadarsh");
		obj.put("job", "CEO");
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification given = RestAssured.given();
		given.body(obj.toString());
		given.headers("Content-Type","application/json");
		
		Response response = given.request(Method.POST, "/api/users/2");
        
		Gson gson=new Gson();
		User user=gson.fromJson(response.getBody().asString(),User.class);
		System.out.println(user.getName());
	}

}
