package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController  {

    @GetMapping("hello1")
    public List<HelloEntity> getEntitis(){
        List<HelloEntity> entitis=new ArrayList<>();
        HelloEntity entiti1= new HelloEntity();
        entiti1.getLang();
        entiti1.gethelloDifLeng();
        return entitis;
        
    }
    
   /* @GetMapping("/hello")
    public String getMessage(@RequestParam(name="lang") String name){
        
        
        return "Hello Word on "+name;


    }*/
    @GetMapping("/hello2")
    HelloEntity getEntity(@RequestParam(name="lang",required = false) String name){
        if(name==null){
            return new HelloEntity();

        }
        List<HelloEntity> helloEntities=getEntitis();
        for(HelloEntity entiti1:helloEntities ){
            if(entiti1.getLang()==name){
                return entiti1;
            }
            
        }
        return null;

    }
}
