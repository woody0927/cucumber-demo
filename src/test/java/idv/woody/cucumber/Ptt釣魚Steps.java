package idv.woody.cucumber;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class Ptt釣魚Steps {

	@Given("^一個有發文權限的帳號$")
	public void 一個有發文權限的帳號() throws Throwable {
	}

	@When("^登入Ptt$")
	public void 登入Ptt() throws Throwable {
	}

	@When("^進入熱門板Gossip發癈文$")
	public void 進入熱門板Gossip發癈文() throws Throwable {
	}

	@When("^網友推文罵我腦殘$")
	public void 網友推文罵我腦殘() throws Throwable {
	}

	@When("^進入警局提告$")
	public void 進入警局提告() throws Throwable {
	}

	@Then("^得到一筆合解金$")
	public void 得到一筆合解金() throws Throwable {
	}
}
