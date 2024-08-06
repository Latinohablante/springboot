package com.j3appdemo.j3_app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.User;
import com.j3appdemo.j3_app.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Johlver","Pardo");
        userDto.setTitle("Desarrollando con Spring boot CreativeCode");
        userDto.setUser(user);
        return userDto;


        /* 
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("user", user);
        return body;
        */
    }

    @GetMapping("/list-details")
    public List<User> listdetails(){
        User user = new User("Juan","Perez");
        User userA = new User("Camilo","Hernandez");
        User userB = new User("Martha","Estupiñan");
        List<User> lstUsers = new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }

    @GetMapping("/list-array-details")
        public List<User> listarraydetails(){
        User user = new User("Juan","Perez");
        User userA = new User("Camilo","Hernandez");
        User userB = new User("Martha","Estupiñan");
        List<User> lstUsers = Arrays.asList(user,userA,userB);
        return lstUsers;
    }
}
