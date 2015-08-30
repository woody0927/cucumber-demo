package idv.woody.cucumber;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import static org.junit.Assert.*;

@StepDefAnnotation
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class Ptt釣魚Steps {
	
	private double settlement;

	@Given("^一個有發文權限的帳號$")
	public void 一個有發文權限的帳號() throws Throwable {
		System.out.println("建一個帳號");
		System.out.println("給予發文權限");
	}

	@When("^登入Ptt$")
	public void 登入Ptt() throws Throwable {
		System.out.println("登入Ptt");
	}

	@When("^進入熱門板(.+)發癈文$")
	public void 進入熱門板Gossip發癈文(String board) throws Throwable {
		System.out.println(String.format("進入熱門板%s發癈文", board));
	}

	@When("^網友推文罵我(.+)$")
	public void 網友推文罵我腦殘(String profanity) throws Throwable {
		System.out.println(String.format("aabbcc 嚧: %s", profanity));
	}

	@When("^進入警局提告$")
	public void 進入警局提告() throws Throwable {
		System.out.println("進入警局提告");
		settlement = 500d;
	}

	@Then("^得到一筆合解金$")
	public void 得到一筆合解金() throws Throwable {
		assertTrue(settlement > 0);
	}
}
