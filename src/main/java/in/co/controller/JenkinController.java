package in.co.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JenkinController {

	private String name;

	@GetMapping("/{name}")
	public String getName(@PathVariable String name) {
		this.name = name;
		return this.name;
	}

	@GetMapping
	public String setName() {
		return this.name;
	}
}
