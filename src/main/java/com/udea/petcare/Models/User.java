package com.udea.petcare.Models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Setter
@Getter

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String description;
    @NotNull
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String city;



}
