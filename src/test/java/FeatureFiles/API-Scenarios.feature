Feature: Wipro API TEST Assignment


@yes
Scenario: Scenario4 - Check the given end point response to see if it contains this email address "Eliseo@gardner.biz" 

Given the end point is "https://jsonplaceholder.typicode.com/comments/1"
Then the email address in the response should be "Eliseo@gardner.biz"

@yes
Scenario: Scenario5 - Check the given end point response to see if it returns 10 users
Given the end point is "https://jsonplaceholder.typicode.com/users"
Then the response should contain 10 users