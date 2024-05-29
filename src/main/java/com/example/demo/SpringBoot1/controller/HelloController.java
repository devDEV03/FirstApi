package com.example.demo.SpringBoot1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Controller
@RestController
public class HelloController {

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello,Welcome to my First REST API";
    }
}
