package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForHelloWorld {


	public ControllerForHelloWorld() {
	}

	@GetMapping("/hello-rest")
	public  String hello() {

		return "Hello World";

	}
	public String getHello() { return hello(); }

}
