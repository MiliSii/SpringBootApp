package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Controller
public class ControllerForHtml {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String index() {
        return "hello.html";
    }
}