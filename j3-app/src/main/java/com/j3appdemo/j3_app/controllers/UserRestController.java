package com.j3appdemo.j3_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.User;

@RestController
@RequestMapping("/v2/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String,Object> details(){
        User user = new User("Johlver","Pardo");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("user", user);
        return body;
    }
}
