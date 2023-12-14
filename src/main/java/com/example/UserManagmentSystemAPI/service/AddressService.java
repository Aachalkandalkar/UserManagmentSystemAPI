package com.example.UserManagmentSystemAPI.service;

import com.example.UserManagmentSystemAPI.model.Address;
import com.example.UserManagmentSystemAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private IAddressRepo addressRepo;
    public Address getAddressById(Long addressId) {
        return addressRepo.findById(addressId).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address updateAddress(Long addressId, Address updatedAddress) {
        if(addressRepo.existsById(addressId)){
            updatedAddress.setAddressId(addressId);
            return addressRepo.save(updatedAddress);
        }else{
            return null;
        }
    }

    public void deleteAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
    }
}
