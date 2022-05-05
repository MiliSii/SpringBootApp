
package com.example.demo;


import javax.servlet.http.HttpServletRequest;

//import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;



@Controller
public class ControllerForHtml {
   // Logger logger=LoggerFactory.getLogger(ControllerForHtml.class);
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request){

        System.out.println("Saying hello world Spring Boot....");
        request.setAttribute("message", "Hello World");
        //logger.trace("ControllerForHtml method accessed");
        return "hello";
    }
}