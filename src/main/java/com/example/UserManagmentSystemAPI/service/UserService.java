package com.example.UserManagmentSystemAPI.service;

import com.example.UserManagmentSystemAPI.model.User;
import com.example.UserManagmentSystemAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepo userRepo;


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }


    public User createUser(User user) {
        return userRepo.save(user);
    }


    public User updateUser(Long userId, User updatedUser) {
        if(userRepo.existsById(userId)){
            updatedUser.setUserId(userId);
            return userRepo.save(updatedUser);
        }else{
            return null;
        }
    }

    public void deleteUserById(Long userId) {
        userRepo.deleteById(userId);
    }

    public void deleteAllUser() {
        userRepo.deleteAll();
    }
}
