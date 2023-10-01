package com.crudJavaUser.userJavaCrud.controller;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void postUser(@RequestBody User userToCreate){
        userService.create(userToCreate);
    }

}
