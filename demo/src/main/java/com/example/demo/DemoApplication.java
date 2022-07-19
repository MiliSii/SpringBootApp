package com.example.demo;

import com.example.demo.advice.controller.APIControlers;
import com.example.demo.model.HelloEntity;
import com.example.demo.service.HelloService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
@EnableWebSecurity
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	/*	Result result = JUnitCore.runClasses(JUnitSetUp.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}*/


	}


}

