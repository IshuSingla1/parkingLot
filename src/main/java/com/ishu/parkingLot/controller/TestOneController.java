package com.ishu.parkingLot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOneController {
	
	@RequestMapping("/test/one")
	public String abc() {
		return "Hello Baby";
	}

}
