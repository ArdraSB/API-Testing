Feature: sample api test for put
Scenario: test a sample put api
Given url 'https://jsonplaceholder.typicode.com/posts/1'
And request {"title": "fooooo","body":"bar","userId":1}
When  method put
Then status 200