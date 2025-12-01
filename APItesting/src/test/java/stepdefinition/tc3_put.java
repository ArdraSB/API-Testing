package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc3_put {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY=
			"{"+
				"\"id\":1,"+
				"\"title\":\"foo\","+
				"\"body\":\"bar\","+
				"\"userId\":1"+
			"}";
	@Given("the user in the URL https:\\/\\/jsonplaceholder.typicode.com\\/posts\\/{int}")
	public void the_user_in_the_URL_https_jsonplaceholder_typicode_com_posts(Integer int1) {
		System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	}

	@When("he sends the put request")
	public void he_sends_the_put_request() {
		System.out.println("He sends PUT request");
		request=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(REQUEST_BODY);
		response=request.put();
	}

	@Then("he gets the response of {int} and the updated data")
	public void he_gets_the_response_of_and_the_updated_data(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println("code "+int1);
		System.out.println(response.getStatusCode());
	}
	
}
