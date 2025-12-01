package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_steps {
	private static final String Base_url="https://api.restful-api.dev/";
	Response response;
	RequestSpecification request;
	String output;
	
	@Given("the user in URL https:\\/\\/api.restful-api.dev\\/objects")
	public void the_user_in_URL_https_api_restful_api_dev_objects() {
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
	   System.out.println("nooo");
	   output= response.asString();
	   System.out.println(output);
	   int statuscode= response.getStatusCode();
	   System.out.println(statuscode);
	   
	}
}
