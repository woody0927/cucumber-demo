package idv.woody.cucumber;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import idv.woody.model.User;
import idv.woody.service.MemoryService;
import idv.woody.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class LoginStepsIT {
	
	@Autowired
	private UserService userService;
	@Autowired
	private MemoryService memoryService;
	
	private User registeredUser;
	private String inputUsername;
	private String inputPassword;
	private User loginUser;
	
	@Before
	public void beforeScenario() {
		registeredUser = new User();
	}
	
	@After
	public void afterScenario() {
		memoryService.rollbackChanges();
	}
	
	@Given("^I registered an account on the website with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void I_registered_an_account_on_the_website_with_username_and_password(String username, String password) throws Throwable {
		registeredUser.setUsername(username);
		registeredUser.setPassword(password);
		userService.saveOrUpdate(registeredUser);
	}

	@When("^I provide the username \"([^\"]*)\"$")
	public void I_provide_the_username(String username) throws Throwable {
		inputUsername = username;
	}

	@When("^correct password \"([^\"]*)\"$")
	public void correct_password(String password) throws Throwable {
	    inputPassword = password;
	}

	@When("^submit my request$")
	public void submit_my_request() throws Throwable {
		try {
			loginUser = userService.login(inputUsername, inputPassword);
		} catch (Exception e) {
		}
	}

	@Then("^I should be successfully logged in$")
	public void I_should_be_successfully_logged_in() throws Throwable {
		assertNotNull(loginUser);
	}

	@When("^wrong password \"([^\"]*)\"$")
	public void wrong_password(String wrongPassword) throws Throwable {
	    inputPassword = wrongPassword;
	}

	@Then("^I should not be logged in$")
	public void I_should_not_be_logged_in() throws Throwable {
	    assertNull(loginUser);
	}
}
