package com.example.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/signup")
    public String registerUser(){
        return "signup";
    }

    @GetMapping("/login")
    public String loginUser(){
        return "login";
    }
}
