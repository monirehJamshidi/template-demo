package com.example.demo.controller;

import com.example.demo.dto.UserResponse;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // Endpoint: http://localhost:8080/user?name=Monire&age=30
    @RequestMapping("/user")
    public UserResponse getUser(@RequestParam String name, @RequestParam int age){
        return userService.getUser(name, age);
    }

    @RequestMapping("/getUser_with_FMT")
    public String getUser_with_FMT(@RequestParam String name, @RequestParam int age){
        return userService.getUser_with_FMT(name, age);
    }
}
