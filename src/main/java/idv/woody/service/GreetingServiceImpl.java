package idv.woody.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public String getGreeting(String name) {
		return String.format("Hi %s!", name);
	}

}
