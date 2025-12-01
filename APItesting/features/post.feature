Feature: Testing Post request
Scenario: testing the API for post
Given the user in the URL https://jsonplaceholder.typicode.com/posts
When he sends the post request
Then he gets the response of 201 and the data