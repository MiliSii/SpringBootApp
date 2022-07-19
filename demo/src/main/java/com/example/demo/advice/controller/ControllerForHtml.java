package com.example.demo.advice.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForHtml {

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {

        request.setAttribute("message", "Hello World");
        return "hello";
    }
}