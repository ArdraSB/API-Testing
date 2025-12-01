Feature: testing PUT request
Scenario: testing the API for PUT
Given the user in the URL https://jsonplaceholder.typicode.com/posts/1
When he sends the put request
Then he gets the response of 200 and the updated data