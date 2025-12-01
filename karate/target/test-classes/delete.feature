Feature: sample api test for delete
Scenario: test a sample delete api
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When  method delete
Then status 200