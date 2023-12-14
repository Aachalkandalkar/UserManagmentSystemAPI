package com.example.UserManagmentSystemAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "firstName is required")
    private String firstName;

    @NotBlank(message = "lastName is required")
    private String lastName;

    @Size(min = 10, max = 12, message = "Mo No must be in 10 to 12 digit")
    private String MoNo;

    @NotBlank(message = "email required")
    @Email(message = "valid email required")
    private String email;

   @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;
}