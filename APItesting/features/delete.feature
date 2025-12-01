Feature: testing DELETE request
Scenario: testing the API for DELETE
Given the user in the URL for delete https://jsonplaceholder.typicode.com/posts/1
When he sends the delete request
Then he gets the response of 200 and the data deleted