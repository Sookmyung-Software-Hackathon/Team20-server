package com.example.smswhteam20.domain;

import javax.persistence.Entity;
import java.util.HashMap;

@Entity
public class Member  {
    private String id;
    private String name;
    private String password;
    private String email;
    private String telNum;

    public HashMap<String, Registration> registrationIdList;

    public Member(String id, String name, String password, String email, String telNum) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.telNum = telNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public HashMap<String, Registration> getRegistrationIdList() {
        return registrationIdList;
    }

    public void setRegistrationIdList(HashMap<String, Registration> registrationIdList) {
        this.registrationIdList = registrationIdList;
    }
}
