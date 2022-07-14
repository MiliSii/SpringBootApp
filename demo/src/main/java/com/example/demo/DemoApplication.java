package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@SpringBootApplication
@EnableWebSecurity
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		Result result = JUnitCore.runClasses(JUnitSetUp.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}

	}
	


