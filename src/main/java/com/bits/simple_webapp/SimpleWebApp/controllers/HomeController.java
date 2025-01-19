package com.bits.simple_webapp.SimpleWebApp.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Simple Web app";
    }

    @RequestMapping("/about")
    public String about(){
        return "I love to backend";
    }
}
