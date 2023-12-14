package com.example.UserManagmentSystemAPI.controller;


import com.example.UserManagmentSystemAPI.model.User;
import com.example.UserManagmentSystemAPI.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //get all users
    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // get user by Id
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    // create user
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    //update user
    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId , @Valid @RequestBody User updatedUser){
        return userService.updateUser(userId,updatedUser);

    }

    //delete user by Id
    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }

    // delete all user
    @DeleteMapping("/deleteAll")
    public void deleteAllUser(){
        userService.deleteAllUser();
    }

}
