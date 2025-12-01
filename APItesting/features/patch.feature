Feature: testing PATCH request
Scenario: testing the API for PATCH
Given the user in the URL for patch https://jsonplaceholder.typicode.com/posts/1
When he sends the patch request
Then he gets the response of 200 and the changed data