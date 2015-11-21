Feature: Login
    As a user
    I want to log in to the website
    so that I can access to the content
	
Scenario: valid credentials
	Given I registered an account on the website with username "tim.duncan" and password "P@ssw0rd"
	 When I provide the username "tim.duncan"
	  And correct password "P@ssw0rd"
	  And submit my request
	 Then I should be successfully logged in
	 
Scenario: invalid credentials
	Given I registered an account on the website with username "tim.duncan" and password "P@ssw0rd"
	 When I provide the username "tim.duncan"
	  And wrong password "wrongPwd"
	  And submit my request
	 Then I should not be logged in	 
