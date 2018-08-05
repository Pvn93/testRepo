package com.example.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	public Log log = LogFactory.getLog(TestController.class);
	
	@RequestMapping("/sample")
	public String test() {
		log.info("Inside the test controller!!!!!");
		return "This is just a sample text returned from controller";
	}
}
