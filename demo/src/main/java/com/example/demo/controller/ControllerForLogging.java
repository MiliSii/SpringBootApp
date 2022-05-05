package com.example.demo.controller;

/*import org.slf4j.LoggerFactory;
import org.slf4j.Logger;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerForLogging {
    
    //Logger logger=LoggerFactory.getLogger(ControllerForLogging.class);
    
    @RequestMapping("/")
    public String home(){
       // logger.trace("Home method accessed");//svaki put kad se pristupi poruka ce se ispisati u terminal-u

        return "working";
        
    }
}
