package com.example.UserManagmentSystemAPI.controller;

import com.example.UserManagmentSystemAPI.model.Address;
import com.example.UserManagmentSystemAPI.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    //get address by id
    @GetMapping("/{addressId}")
    public Address getAddressById(@PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }

    // create address
    @PostMapping("create")
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    // update address
    @PutMapping("/{addressId}")
    public Address updateAddress(@PathVariable Long addressId , @Valid @RequestBody Address updatedAddress){
        return addressService.updateAddress(addressId,updatedAddress);
    }

    //delete address
    @DeleteMapping("/{addressId}")
    public void deleteAddressById(@PathVariable Long addressId){
        addressService.deleteAddressById(addressId);
    }
}
