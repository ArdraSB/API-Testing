Feature: sample api test for  patch
Scenario: test a sample patch api
Given url 'https://jsonplaceholder.typicode.com/posts/1'
And request {"body":"bar"}
When  method patch
Then status 200