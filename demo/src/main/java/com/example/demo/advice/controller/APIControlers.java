package com.example.demo.advice.controller;

import com.example.demo.model.HelloEntity;
import com.example.demo.repository.HelloRepository;
import com.example.demo.service.HelloService;
import com.example.demo.service.HttpRequest1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class APIControlers {


    @Autowired private HelloRepository helloRepository;
    @Autowired private HttpRequest1 httpRequest1;

    @Autowired
    private HelloService helloService;
    private Object modelAndView;

  /*  @RequestMapping(path = "/testic", method=RequestMethod.POST)
    public String m(){
        return "radi";
    }*/

    //GET method
    @GetMapping(value = "/GETHello")
    //@RequestMapping("/GETHello")
    public List<HelloEntity> getHello1(){
        return helloRepository.findAll();
    }//working

    //POST method
    @PostMapping(value = "/saveHello")
    public String saveHello(@RequestBody HelloEntity helloEntity){
        helloRepository.save(helloEntity);
        return "Saved";
    }//working

    //PUT method
    @PutMapping(value = "/update/{id}")
    public String updateHello(@PathVariable long id, @RequestBody HelloEntity helloEntity){
        HelloEntity updatedHello=helloRepository.findById(id).get();
        updatedHello.setLang(helloEntity.getLang());
        updatedHello.sethelloDifLeng(helloEntity.gethelloDifLeng());
        helloRepository.save(updatedHello);
        return "updated hello";
    }//working

    //DELETE method
    @DeleteMapping(value = "/delete/{id}")
    public String deleteHello(@PathVariable long id){
        HelloEntity deleteUser=helloRepository.findById(id).get();
        helloRepository.delete(deleteUser);
        return "deleted hello id "+id;
    }//working

    @GetMapping(value = "/GETAlbums")
    public void getH(){
        httpRequest1.httpCall();
    }//working




}













