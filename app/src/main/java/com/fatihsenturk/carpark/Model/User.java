package com.fatihsenturk.carpark.Model;

import java.util.ArrayList;

/**
 * Created by fatih on 21.12.2015.
 * CarPark App
 */
public class User {
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private Integer age;
    private ArrayList<Rota> rotaArrayList; // bunu da kullanicinin daha once ki rotalarini mesela 3 gun once ki nereye park etti ne etti onlari turariz

    public User() {
    }

    public User(String name, String lastname, String username, String email, String password, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
