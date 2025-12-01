package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc5_delete {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	@Given("the user in the URL for delete https:\\/\\/jsonplaceholder.typicode.com\\/posts\\/{int}")
	public void the_user_in_the_URL_for_delete_https_jsonplaceholder_typicode_com_posts(Integer int1) {
		System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	}

	@When("he sends the delete request")
	public void he_sends_the_delete_request() {
		System.out.println("User sends DELETE request");
		request=RestAssured.given();
		response=request.delete();
	}

	@Then("he gets the response of {int} and the data deleted")
	public void he_gets_the_response_of_and_the_data_deleted(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println("code "+int1);
		System.out.println(response.getStatusCode());
	}
}
