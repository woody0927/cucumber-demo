Feature: Greet new comers
	as a greeting service
	when someone comes in I should greet him
	so that he feel comfortable
	
Scenario: Woody get greets when he comes to GreetingService
	Given A greeting service
	 When Woody comes in
	 Then the service will say Hi Woody!
	
	
	