Feature: sample api test for post
Scenario: test a sample post api
Given url 'https://jsonplaceholder.typicode.com/posts'
And request {"id": 101,"title": "foo","body":"bar","userId":1}
When  method post
Then status 201