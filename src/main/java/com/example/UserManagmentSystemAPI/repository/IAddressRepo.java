package com.example.UserManagmentSystemAPI.repository;

import com.example.UserManagmentSystemAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {
}
