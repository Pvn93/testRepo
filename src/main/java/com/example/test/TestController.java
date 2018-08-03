package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/sample")
	public String test() {
		return "This is just a sample text returned from controller";
	}
	/* test*/
}
