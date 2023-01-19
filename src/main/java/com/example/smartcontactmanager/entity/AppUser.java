package com.example.smartcontactmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer appUserId;
    private String appUserFirstName;
    private String appUserLastName;
    private String email;
    private String password;
    private String role;
}
