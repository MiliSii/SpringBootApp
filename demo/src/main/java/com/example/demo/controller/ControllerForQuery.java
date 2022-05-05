package com.example.demo.controller;

//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;
import java.util.Map;
//import java.util.Locale.Category;

import com.example.demo.HelloEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/hello1")
public class ControllerForQuery {
   @Autowired HelloEntity he;


/*
   @GetMapping("")
    public String getHello(@RequestParam(name="lang") String lang){
        return he.gethelloDifLeng();
    }*/

/*    @RequestMapping(value="user", method = RequestMethod.GET)
public @ResponseBody String getItem(@RequestParam("data") String lang){

    he.getLang();              
    return  he.gethelloDifLeng();
    
    
}*/

@GetMapping("/api")
@ResponseBody
public String getFoos(@RequestParam String lang) {
    return "ID: " + lang;
}

@PostMapping("/api/foos")
@ResponseBody
public String updateFoos(@RequestParam Map<String,String> allParams) {
    return "Parameters are " + allParams.entrySet();
}
  
}
