package com.example.scholarpatrol.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int user_id;
    private String  username;
    private String  password;
    private String  role;

    //constructor
    public User() {};

    //constructor with parameters
    public User(String userName, String passWord, String roLe)
    {
        this.username = userName;
        this.password = passWord;
        this.role = roLe;
    }

    //getters and setters

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //toString method

    @Override
    public String toString() {
        return "User{"+
                "ID="+ user_id +
                ", Username='" + username +
                ", Password='" + password +
                ", role='" + role + '\'' +
                '}';
    }
}
