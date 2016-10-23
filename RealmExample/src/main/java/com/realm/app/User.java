package com.realm.app;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by YangBin on 2016/10/24.
 */

public class User extends RealmObject {
    @PrimaryKey
    private String id;
    private String name;
    private int age;
    private RealmList<User> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RealmList<User> getFriends() {
        return friends;
    }

    public void setFriends(RealmList<User> friends) {
        this.friends = friends;
    }
}