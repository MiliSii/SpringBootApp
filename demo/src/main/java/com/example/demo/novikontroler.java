package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("employees/")
public class novikontroler {
    @Autowired
    helloService hs;

    @Autowired
    helloRepository er;

  /*  @GetMapping("hellowithlang")
    public List<HelloEntity>getAllEmployeesWithName(@RequestParam String lang)
    {
        return hs.findMessageByLang(lang);
    }
    @GetMapping("sayHello")
    public String sayHello(){
        return "helllooo";
    }

    @GetMapping("sayHello1")
    public List<HelloEntity> getHello(){
        return hs.getHello();
    }*/

    @GetMapping("allemployees")
    public List<HelloEntity> getAllEmployees()
    {
        return hs.findAll();
    }
/*
    @GetMapping("employeeswithname")
    public List<HelloEntity> getAllEmployeesWithName(@RequestParam String lang)
    {
        return hs.findEmployeesByName(lang);
    }*/

    
}
