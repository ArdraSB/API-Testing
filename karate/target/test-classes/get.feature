Feature: sample API tests
Scenario: test a sample GET API
Given url 'https://jsonplaceholder.typicode.com/posts'
When  method get
Then status 200