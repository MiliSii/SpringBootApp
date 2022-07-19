package com.example.demo.advice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AlbumsControllers {
    @GetMapping(value = "/albums")
    public String getView(){
        return "albumes";
    }
}
