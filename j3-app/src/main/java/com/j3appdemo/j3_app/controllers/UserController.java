package com.j3appdemo.j3_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.j3appdemo.j3_app.models.User;



@Controller

public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Johlver","Pardo");
        model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
        model.addAttribute("user", user);
        return "details";
}
    
}
