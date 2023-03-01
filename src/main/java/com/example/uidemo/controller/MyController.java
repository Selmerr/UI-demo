package com.example.uidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String frontpage(){
        return "frontpage";
    }
    @GetMapping("/private_user")
    public String private_user(){
        return "private_user";
    }
}
