package com.example.UserManagmentSystemAPI.repository;

import com.example.UserManagmentSystemAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
}
