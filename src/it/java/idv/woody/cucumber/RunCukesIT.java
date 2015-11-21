package idv.woody.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//strict mode sets the missing steps to failure
@CucumberOptions(strict = true)
public class RunCukesIT {

}
