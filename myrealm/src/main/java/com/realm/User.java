package com.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by YangBin on 2016/10/24.
 */

public class User extends RealmObject {
    @PrimaryKey
    private Long id;
    private String name;
    private String passWord;
    private String email;
    private String phoneNumber;
    private String description;

    public User() {
    }

    public User(Long id, String name, String passWord, String email, String phoneNumber, String description) {
        this.id = id;
        this.name = name;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}