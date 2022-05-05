package com.example.demo;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class helloService {

    @Autowired HelloEntity he;
    @Autowired helloRepository er;

    public helloService(){

    }

    
    public List<HelloEntity> findAll() {
        return er.findAll();
    }
/*
    public List<HelloEntity> findEmployeesByName(String lang){
        return er.findByEmployeename(lang);
    }*/
}