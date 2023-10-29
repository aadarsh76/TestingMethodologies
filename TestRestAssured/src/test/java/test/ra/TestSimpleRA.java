package test.ra;

//import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class TestSimpleRA {

	public static void main(String[] args) {
		//https://reqres.in/api/unknown/2
//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification given = RestAssured.given();
		TestRALib lib=new TestRALib();
//		Response response=lib.Getuser(6);
		Response response=lib.Postuser();
		System.out.println(response.getBody().asString());
		

	}

}
