package Capstone.AutomationPractice8;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
public class API {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response io = get("https://reqres.in/api/users?page=2");
		io.prettyPrint();
		int statuses = io.getStatusCode();
		System.out.println(statuses);
		Assert.assertEquals(statuses, 200);
		ResponseBody body = io.getBody();
		String converttostring = body.asString();
		System.out.println(converttostring);
		Assert.assertEquals(converttostring.contains("Ferguson"),true,"Name is not displayiing");
		Post();
	}
	public static void Post() {
		File ot = new File(System.getProperty("user.dir") + "\\House.json");
		Response us = given().contentType(ContentType.JSON).body(ot).post("https://reqres.in/api/users");
		us.prettyPrint();
		System.out.println(us.getStatusCode());
		
		
		

}
}
