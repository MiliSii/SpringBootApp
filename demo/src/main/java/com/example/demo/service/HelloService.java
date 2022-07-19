package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.model.HelloEntity;
import com.example.demo.repository.HelloRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloService {

    //dodat kod
//    private List<HelloEntity> h=new ArrayList<>(
//            Arrays.asList(
//                    new HelloEntity(15L,"test","test"),
//                    new HelloEntity(16L,"test","test")
//            )
//    );
//
//    public List<HelloEntity> getAll(){
//        return h;
//    }



    //stari kod
    static List<HelloEntity> hellos = new ArrayList<>();

    @Autowired
    HelloRepository helloRepository;

    public List<HelloEntity> getHellos() {
        return hellos;
    }

    public HelloEntity getHelloByLang(String lang) {
        return helloRepository.findByLangIgnoreCase(lang);
    }

    public boolean saveToDB(HelloEntity hello) {
        helloRepository.save(hello);
        return true;
    }

    public List<HelloEntity> getHellosFromDB() {
        return helloRepository.findAll();
    }

    public boolean isValid(HelloEntity hello) {
        if (hello.getLang() == null || hello.gethelloDifLeng() == null) {
            return false;
        } else {
            return true;
        }
    }
}
