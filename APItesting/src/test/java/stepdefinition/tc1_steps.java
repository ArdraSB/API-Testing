package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_steps {
	private static final String Base_url="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	

	@Given("the user in URL https:\\/\\/jsonplaceholder.typicode.com\\/posts")
	public void the_user_in_URL_https_jsonplaceholder_typicode_com_posts() {
		System.out.println("GET request");
	    System.out.println("user is in url page");
	    RestAssured.baseURI=Base_url;
	}

	@When("he sends the get request")
	public void he_sends_the_get_request() {
	    System.out.println("user send request");
	    request= RestAssured.given();
	    response= request.get(Base_url);
	    
	}

	@Then("he gets the response of {int}")
	public void he_gets_the_response_of(Integer int1) {
	   output= response.asString();
	   System.out.println(output);
	   int statuscode= response.getStatusCode();
	   System.out.println(statuscode);
	   
	}
}
