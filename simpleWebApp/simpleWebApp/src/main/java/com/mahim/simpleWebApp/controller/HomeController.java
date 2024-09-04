package com.mahim.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String controller(){
        return "Hei,there!!";
    }
    @RequestMapping("/about")
    public String about(){
        return "Hello World!";
    }
}
