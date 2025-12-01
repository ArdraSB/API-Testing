package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc2_steps {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY = 
			"{"+
					"\"title\":\"foo\","+
					"\"body\":\"bar\","+
					"\"userId\":1"+
					"}";
	@Given("the user in the URL https:\\/\\/jsonplaceholder.typicode.com\\/posts")
	public void the_user_in_the_URL_https_jsonplaceholder_typicode_com_posts() {
		System.out.println("User enters URL");
	    RestAssured.baseURI=BASE_URL;
	    request=RestAssured.given()
	    		.contentType(ContentType.JSON)
	    		.body(REQUEST_BODY);
	}

	@When("he sends the post request")
	public void he_sends_the_post_request() {
		System.out.println("User sends POST request");
		response=request.post();
	    
	}

	@Then("he gets the response of {int} and the data")
	public void he_gets_the_response_of_and_the_data(Integer int1) {
		System.out.println("He gets a response of "+int1);
		output=response.asString();
		System.out.println(output);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
	}
	
}
