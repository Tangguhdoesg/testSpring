package com.test.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@GetMapping("test")
	public String testHit() {
		
		return "hitSomething";
	}
}
