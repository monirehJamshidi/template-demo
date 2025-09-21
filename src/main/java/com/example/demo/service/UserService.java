package com.example.demo.service;

import com.example.demo.dto.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static java.util.FormatProcessor.FMT;


@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserResponse getUser(String name, int age){
        String message = STR."welcome \{name}, you are \{age} years old!";

        log.info(STR."Generating response for user \{name} with age \{age}");
        return new UserResponse(name, age, message);
    }

    public String getUser_with_FMT(String name, int age){
        String formatted = FMT."User: %s, Age: %d".formatted(name, age);
        System.out.println(formatted);

        return formatted;//FMT."Name: %s, Age: %d".formatted(name, age);
    }
}
