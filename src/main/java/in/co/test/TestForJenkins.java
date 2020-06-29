package in.co.test;

import org.springframework.stereotype.Component;

@Component
public class TestForJenkins {

	public String test(String name) {
		System.out.println("syso");
		return name;
	}
}
