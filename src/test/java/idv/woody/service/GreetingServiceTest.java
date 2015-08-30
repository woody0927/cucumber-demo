package idv.woody.service;

import idv.woody.service.GreetingService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class GreetingServiceTest {

	@Autowired
	private GreetingService greetingService;
	
	@Test
	public void testGetGreeting(){
		assertEquals("Hi Woody!", greetingService.getGreeting("Woody"));
	}
}
