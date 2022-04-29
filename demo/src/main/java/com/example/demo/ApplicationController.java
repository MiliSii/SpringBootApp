package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/secure")
public class ApplicationController {
    @GetMapping("/hello")
    public String h(){
        return "bdhjbdhj";
    }
}
