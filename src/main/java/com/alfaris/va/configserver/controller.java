package com.alfaris.va.configserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping("/")
	public String test() {
		return "hit";
	}
}
