package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
    @Id
    private String UserName;
    private String name;
    private String Role;
    private int age;
    private String Address;
    private String password;
}
