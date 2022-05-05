package com.example.demo;



//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    //Logger logger=LoggerFactory.getLogger(helloWorld.class);
	@GetMapping("/hello-rest")
	public String hello() {
		//logger.trace("hello() method accessed");
		return "Hello World";
	}
}
