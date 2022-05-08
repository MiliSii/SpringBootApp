package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

//import com.example.demo.repository.HelloRepository;
import com.example.demo.service.HelloService;
import com.example.demo.HelloNotFoundException;
import com.example.demo.model.HelloEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

//import javax.validation.Valid;
@RestController
@RequestMapping("employees/")
public class novikontroler {

    @Autowired
    HelloService helloService;

    @GetMapping("/videos")
    public ResponseEntity<List<HelloEntity>> getHello(@RequestParam(required = false) String lang) {
        if (lang == null) {
            return ResponseEntity.ok(helloService.getHellosFromDB());
        }
        List<HelloEntity> foundHellos = new ArrayList<>();
        HelloEntity hello = helloService.getHelloByLang(lang);
        if (hello != null) {
            foundHellos.add(hello);
        }
        if (foundHellos.isEmpty()) {
            throw new HelloNotFoundException();
        }
        return ResponseEntity.ok(foundHellos);

    }

    @PostMapping("/videos")
    public ResponseEntity<String> addHellos(@Validated @RequestBody HelloEntity hello) {
        boolean hasAdded = helloService.saveToDB(hello);
        if (hasAdded) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.badRequest().build();
    }

}
