package com.ishu.parkingLot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {
	
	//@Autowired
	//private TestService testService;
	
	@RequestMapping("/")
	String hello() {
		return "success";
	}

	@RequestMapping("/test")
	public String abc() {
		return "Hello World";
	}

}
