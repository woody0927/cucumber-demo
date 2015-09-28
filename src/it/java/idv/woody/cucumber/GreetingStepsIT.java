package idv.woody.cucumber;

import idv.woody.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import static org.junit.Assert.*;

@StepDefAnnotation
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class GreetingStepsIT {

	@Autowired
	private GreetingService greetingService;
	
	private String greeting;
	
	@Given("^A greeting service$")
	public void A_greeting_service() throws Throwable {
	    System.out.println("Preparing test fixture @Given");
	}

	@When("^(.+) comes in$")
	public void Woody_comes_in(String woody) throws Throwable {
	    System.out.println("Doing something @When");
	    greeting = greetingService.getGreeting(woody);
	}

	@Then("^the service will say (.+)$")
	public void the_service_will_say_Hi_Woody(String expectedGreeting) throws Throwable {
	    System.out.println("Verifying the result @Then");
	    assertEquals(expectedGreeting, greeting);
	}
}
