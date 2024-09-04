package com.mahim.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
    @RequestMapping("/login")
    public String login() {
        return "Login Successful";
    }
}
